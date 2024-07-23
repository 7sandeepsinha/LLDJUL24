package lldmodule1.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorExample {

    public static void main(String[] args) {
        // Create a ScheduledExecutorService with a single thread
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        // Schedule the task to run periodically every 5 seconds
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("Hello");
        }, 0, 5, TimeUnit.SECONDS);

        // Sleep for a while to allow the task to run multiple times
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Shutdown the ScheduledExecutorService
        scheduledExecutorService.shutdown();
    }
}