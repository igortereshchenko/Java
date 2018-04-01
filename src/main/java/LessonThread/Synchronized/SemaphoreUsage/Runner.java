package LessonThread.Synchronized.SemaphoreUsage;

import java.util.concurrent.Semaphore;

public class Runner {

    public static void  main(String[] args){
        Semaphore sem = new Semaphore(2);
        Resource res = new Resource();
        new Thread(new MyThread(res, sem, "CountThread 1")).start();
        new Thread(new MyThread(res, sem, "CountThread 2")).start();
        new Thread(new MyThread(res, sem, "CountThread 3")).start();
    }
}
