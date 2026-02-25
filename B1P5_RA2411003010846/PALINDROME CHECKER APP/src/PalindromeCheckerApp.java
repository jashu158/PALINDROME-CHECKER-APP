

public class PalindromeCheckerApp {

    // Application constants
    private static final String APP_NAME = "PalindromeChecker App";
    private static final String VERSION = "1.0.0";

    /**
     * Entry point of the application.
     * JVM starts execution from here.
     */
    public static void main(String[] args) {

        displayWelcomeMessage();

        // Placeholder for next use case
        System.out.println("System ready for next operation...");
    }

    /**
     * Displays application information.
     */
    private static void displayWelcomeMessage() {

        System.out.println("========================================");
        System.out.println("        " + APP_NAME);
        System.out.println("========================================");
        System.out.println("Version : " + VERSION);
        System.out.println("Status  : Application Started");
        System.out.println("========================================");
    }
}