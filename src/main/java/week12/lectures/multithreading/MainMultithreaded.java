package week12.lectures.multithreading;

public class MainMultithreaded {
    public static void main(String[] args) {
        for (int i = 0; i<= 5;i++){
            CounterMultithreaded counter = new CounterMultithreaded(i);
            Thread thread = new Thread(counter);
            thread.start();
        }
    }
}
