package LessonThread.Synchronized.TwoThreadSynchronized;

public class ThreadGet extends Thread {

    Resource resource;
    int product=0;

    public ThreadGet(Resource resource)
    {
        this.resource=resource;
    }

    public void run() {
        try
        {
            while(product<Resource.maxCounter){

                product=product+resource.get();
                System.out.println ("ThreadGet recource --");
                System.out.println ("ThreadGet has " + product );
                sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("ThreadGet interrupted");
        }
    }
}
