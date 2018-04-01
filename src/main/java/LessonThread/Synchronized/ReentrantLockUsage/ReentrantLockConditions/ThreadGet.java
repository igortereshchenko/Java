package LessonThread.Synchronized.ReentrantLockUsage.ReentrantLockConditions;

public class ThreadGet implements Runnable {

    Resource resource;


    public ThreadGet(Resource resource)
    {
        this.resource=resource;
    }

    public void run() {
        for (int i = 1; i <= Resource.maxCounter; i++) {
            resource.get();
        }
    }
}
