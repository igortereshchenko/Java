package LessonThread.Synchronized.TwoThreadSynchronized;

public class Resource {

    int counter = 0;
    public static final int maxCounter = 5;


    public synchronized int put() {
        if(counter<=maxCounter)
        {
            counter++;
            System.out.println ("Counter = " + counter);
            return 1;
        }
        return 0;
    }

    public synchronized int get() {
        if(counter>0)
        {
            counter--;
            System.out.println ("Resource counter = " + counter);
            return 1;
        }
        return 0;
    }
}
