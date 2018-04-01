package LessonThread;


public class Runner {

    public static void main(String[] args){

        Thread t = Thread.currentThread();
        System.out.println(t.getName());


        new MyThread("MyThread").start();

        for(int i=1; i<6;i++)
            new MyThread("MyThread " + i).start();


        //Join
        System.out.println("Main...");
        MyThread thread= new MyThread("MyThread Join");
        thread.start();
        try{
            thread.join();
        }
        catch(InterruptedException e){

            System.out.printf("Thread %s stoped", thread.getName());
        }
        System.out.println("Main stopped ...");





        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable,"MyRunnable").start();

        try{
            Thread.sleep(1100);

            myRunnable.disable();

            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Thread stopped");
        }

    }
}
