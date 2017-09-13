public class HelloWorldAnonymousClasses {
//some comments
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            //this is english greeting class
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {
            HelloWorld frenchTolouse = new HelloWorld() {
                String name = "tout";
                public void greet() {

                    greetSomeone("tout");
                }
                public void greetSomeone(String someone) {
                    name = someone;
                    System.out.println("Hello " + name);
                    //throw new java.lang.NullPointerException();
                }
            };

            String name = "tout le monde";
            public void greet() {

                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
                //throw new java.lang.NullPointerException();
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
                throw new java.lang.NullPointerException();
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp =
                new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}

