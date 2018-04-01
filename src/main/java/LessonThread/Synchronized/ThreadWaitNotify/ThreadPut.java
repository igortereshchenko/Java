package LessonThread.Synchronized.ThreadWaitNotify;



public class ThreadPut extends Thread {
    Resource resource; //объект склада, куда кладем товар



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
