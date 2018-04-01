package LessonThread.Synchronized.TwoThreadSynchronized;

public class ThreadPut extends Thread {
    Resource resource; //объект склада, куда кладем товар

    int product=Resource.maxCounter;

    public ThreadPut(Resource resource)
    {
        this.resource=resource;
    }

    public void run() {
        try
        {
            while(product>0){
                product=product-resource.put();
                System.out.println ("ThreadPut resource +1");
                System.out.println ("ThreadPut left =  " + product);
                sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("ThreadPut interrupted");
        }
    }
}
