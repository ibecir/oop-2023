package week12.lectures.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            RunnableTask task = new RunnableTask("Task " + i);
            executorService.submit(task);
        }

        executorService.shutdown();
    }
}

class RunnableTask implements Runnable {
    private final String taskName;

    public RunnableTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Executing " + taskName + " on thread " + Thread.currentThread().getName());
    }
}