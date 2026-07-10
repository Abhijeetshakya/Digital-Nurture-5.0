public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in.");

        Logger logger3 = Logger.getInstance();
        logger3.log("Processing request.");

        System.out.println();
        System.out.println("logger1 hashCode: " + logger1.hashCode());
        System.out.println("logger2 hashCode: " + logger2.hashCode());
        System.out.println("logger3 hashCode: " + logger3.hashCode());

        System.out.println("logger1 == logger2 ? " + (logger1 == logger2));
        System.out.println("logger2 == logger3 ? " + (logger2 == logger3));

        System.out.println();
        System.out.println("Full log history (from logger1's view):");
        System.out.print(logger1.getLogHistory());

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("PASS: Only one Logger instance exists.");
        } else {
            System.out.println("FAIL: Multiple Logger instances were created!");
        }
    }
}
