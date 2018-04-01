package LessonThread.Synchronized.SemaphoreUsage.PhilosophProblem;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread
{
    Semaphore sem;

    int foodCount = 0;

    int id;

    Philosopher(Semaphore sem, int id)
    {
        this.sem=sem;
        this.id=id;
    }

    public void run()
    {
        try
        {
            while(foodCount<3)
            {

                sem.acquire();
                System.out.println ("Philosopher " + id+" eating");

                sleep(500);
                foodCount++;

                System.out.println ("Philosopher " + id+" stop eating");
                sem.release();

                System.out.println ("Philosopher " + id+" sleeping");
                sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("Philosopher " + id + " died");
        }
    }
}