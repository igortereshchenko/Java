package LessonThread;

public class MyRunnable implements  Runnable {


    private boolean isActive;

    public void disable(){
        isActive=false;
    }

    public MyRunnable(){
        isActive = true;
    }


    @Override
    public void run() {
        System.out.printf("Thread %s start... \n", Thread.currentThread().getName());

        int counter=1;

        while(isActive){
            System.out.println("Loop " + counter++);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread stop");
            }
        }


        System.out.printf("Thread %s stop... \n", Thread.currentThread().getName());
    }
}
