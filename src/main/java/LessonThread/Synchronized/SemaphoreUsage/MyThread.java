package LessonThread.Synchronized.SemaphoreUsage;

import java.util.concurrent.Semaphore;

public class MyThread implements Runnable {

    Resource res;
    Semaphore sem;
    String name;

    MyThread(Resource res, Semaphore sem, String name) {
        this.res = res;
        this.sem = sem;
        this.name = name;
    }

    public void run() {

        try {
            System.out.println(name + " waiting");
            sem.acquire();
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name + " release");
        sem.release();
    }
}
