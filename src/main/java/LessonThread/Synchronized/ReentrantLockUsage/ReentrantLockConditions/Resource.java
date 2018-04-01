package LessonThread.Synchronized.ReentrantLockUsage.ReentrantLockConditions;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {

    int counter = 0;
    public static final int maxCounter = 5;

    ReentrantLock locker;
    Condition condition;

    public  Resource(){
        locker = new ReentrantLock();
        condition = locker.newCondition();
    }

    public void put() {
        locker.lock();
        try{

            while (counter>=maxCounter-2)
                condition.await();

            counter++;
            System.out.print("ThreadPut counter++ ");
            System.out.println("Counter =  " + counter);

            condition.signalAll();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock();
        }
    }

    public void get() {
        locker.lock();
        try{

            while (counter<1)
                condition.await();

            counter--;
            System.out.print("ThreadGet counter-- ");
            System.out.println("counter = " + counter);


            condition.signalAll();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock();
        }
    }
}
