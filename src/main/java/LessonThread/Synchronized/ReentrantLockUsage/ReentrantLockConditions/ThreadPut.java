package LessonThread.Synchronized.ReentrantLockUsage.ReentrantLockConditions;



public class ThreadPut implements Runnable{

    Resource resource;

    public ThreadPut(Resource resource)
    {
        this.resource=resource;
    }

    public void run() {
        for (int i = 1; i <= Resource.maxCounter; i++) {
            resource.put();
        }
    }
}
