package LessonThread.Synchronized.ReentrantLockUsage;

import LessonThread.Synchronized.SyncField.Resource;

import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    public static void main(String []args){
    Resource commonResource= new Resource();
    ReentrantLock locker = new ReentrantLock();

        for (int i = 1; i < 6; i++){

        Thread t = new Thread(new MyThread(commonResource, locker));
        t.setName("Thread "+ i);
        t.start();
    }
}
}

