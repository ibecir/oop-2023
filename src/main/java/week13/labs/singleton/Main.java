package week13.labs.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started");
        logger.log("Error: Something went wrong!");

        // Log a success message
        logger.log("Operation completed successfully");
        logger.logInfo("This is an informational message.");
        logger.logWarning("Be cautious! This is a warning message.");
        logger.logError("An error occurred. Please check the logs.");
    }
}
