package LessonThread.Synchronized.ThreadWaitNotify;

public class Resource {

    int counter = 0;
    public static final int maxCounter = 5;


    public synchronized void put() {
        while (counter>=maxCounter-2) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        counter++;
        System.out.println("ThreadPut counter++");
        System.out.println("Counter =  " + counter);
        notify();
    }

    public synchronized void get() {
        while (counter<1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        counter--;
        System.out.println("ThreadGet counter--");
        System.out.println("Counter = : " + counter);
        notify();
    }
}
