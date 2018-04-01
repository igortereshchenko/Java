package LessonThread.Synchronized.ReentrantLockUsage;

import LessonThread.Synchronized.SyncField.Resource;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable {

    Resource res;
    ReentrantLock locker;

    MyThread(Resource res, ReentrantLock locker) {
        this.res = res;
        this.locker = locker;
    }

    public void run() {
        locker.lock();
        try{
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock();
        }
    }
}