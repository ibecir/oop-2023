package year2023.week13.labs.singleton;

public class Logger {
    private static Logger instance;
    private Logger() {

    }

    // Public method to get the instance of the class
    public static Logger getInstance() {
        // Create the instance if it doesn't exist
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log a message
    public void log(String message) {
        System.out.println("Log: " + message);
    }

    public void logInfo(String message) {
        System.out.println("Info: " + message);
    }
    public void logWarning(String message) {
        System.out.println("Warning: " + message);
    }
    public void logError(String message) {
        System.out.println("Error: " + message);
    }

}
