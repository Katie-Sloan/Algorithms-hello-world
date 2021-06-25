public class HelloGoodbye {

    public static void main(String[] args) {
        helloGoodbye(args[0], args[1]);
    }

    public static void helloGoodbye(String firstName, String secondName) {
        System.out.println("Hello " + firstName + " and " + secondName + ".");
        System.out.println("Goodbye " + secondName + " and " + firstName + ".");
    }

}

