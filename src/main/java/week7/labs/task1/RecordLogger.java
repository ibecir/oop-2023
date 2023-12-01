package week7.labs.task1;


public record RecordLogger(String loggerName) implements Logger {
    @Override
    public void logMessage(LogMessageProvider messageProvider) {
        System.out.println("Record Logger [" + loggerName + "]: " + messageProvider.provideMessage());
    }
}