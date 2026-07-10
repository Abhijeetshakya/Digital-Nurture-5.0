public class Logger {

    private static volatile Logger instance;
    private final StringBuilder logHistory = new StringBuilder();

    private Logger() {
        System.out.println("Logger instance created: " + this.hashCode());
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        String entry = "[LOG] " + message;
        System.out.println(entry);
        logHistory.append(entry).append(System.lineSeparator());
    }

    public String getLogHistory() {
        return logHistory.toString();
    }
}
