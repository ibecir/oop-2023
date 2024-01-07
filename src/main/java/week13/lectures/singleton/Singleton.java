package week13.lectures.singleton;

// Not thread safe piece of code
public class Singleton {
    private static Singleton instance;
    private String connectionString;

    private Singleton(String connectionString) {
        this.connectionString = connectionString;
    }

    public static Singleton getInstance(String connectionString) {
        // Makes it a thread safe as only one thread can execute
        // this piece of code at a certain point of time
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(connectionString);
            }
        }
        return instance;
    }
}

class Becir {
    public static void main(String[] args) {

    }
}