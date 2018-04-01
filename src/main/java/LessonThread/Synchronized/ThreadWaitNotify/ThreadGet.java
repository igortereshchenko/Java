package LessonThread.Synchronized.ThreadWaitNotify;



public class ThreadGet extends Thread {

    Resource resource;
    int product=0;

    public ThreadGet(Resource resource)
    {
        this.resource=resource;
    }

    public void run() {
        for (int i = 1; i <=Resource.maxCounter; i++) {
            resource.get();
        }
    }
}
