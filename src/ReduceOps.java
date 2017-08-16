import java.util.Objects;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Sink;
import java.util.stream.StreamShape;
import java.util.stream.ReduceOps;

final class ReduceOps {
    public static TerminalOp<Double, Double>
    makeDouble(double identity, DoubleBinaryOperator operator) {

        Objects.requireNonNull(operator);
        class ReducingSink
                implements ReduceOps.AccumulatingSink<Double, Double, ReducingSink>, Sink.OfDouble {
            private double state;

            @Override
            public void begin(long size) {
                state = identity;
            }

            @Override
            public void accept(double t) {
                state = operator.applyAsDouble(state, t);
            }

            @Override
            public Double get() {
                return state;
            }

            @Override
            public void combine(ReducingSink other) {
                accept(other.state);
            }
        }
        return new ReduceOps.ReduceOp<Double, Double, ReducingSink>(StreamShape.DOUBLE_VALUE) {
            @Override
            public ReducingSink makeSink() {
                return new ReducingSink();
            }
        };
    }
}
