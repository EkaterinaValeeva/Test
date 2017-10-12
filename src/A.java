/**class documentation
 *
 * */

public class A implements Interface {
       private B b;

    @Override
    public String getString() {
        return null;
    }

    @Override
    public void printData() {

    }

    public String s;

    public void foo(int v, char c, String s) {};
    @Override
    public int getCounter() {
        return getB().g.length();
    }

    public B getB() {
            return b;
        }
//B setter
        public void setB(B b) {
            this.b = b;
        }


}


