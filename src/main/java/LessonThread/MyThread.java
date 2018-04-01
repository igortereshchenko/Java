package LessonThread;

public class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }

    public void run(){

        System.out.printf("Thread %s start... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }
        System.out.printf("Thread %s stoped... \n", Thread.currentThread().getName());
    }
}
