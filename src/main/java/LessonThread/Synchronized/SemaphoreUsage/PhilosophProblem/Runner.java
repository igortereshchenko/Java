package LessonThread.Synchronized.SemaphoreUsage.PhilosophProblem;

import LessonThread.Synchronized.SemaphoreUsage.MyThread;
import LessonThread.Synchronized.SemaphoreUsage.Resource;

import java.util.concurrent.Semaphore;

public class Runner {

    public static void  main(String[] args){
        Semaphore sem = new Semaphore(2);
        for(int i=1;i<6;i++)
            new Philosopher(sem,i).start();
    }
}
