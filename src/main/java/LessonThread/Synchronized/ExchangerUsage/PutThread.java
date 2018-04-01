package LessonThread.Synchronized.ExchangerUsage;

import java.util.concurrent.Exchanger;

public class PutThread implements Runnable{

    Exchanger<String> exchanger;
    String message;

    PutThread(Exchanger ex){

        this.exchanger=ex;
        message = "Hello Java!";
    }
    public void run(){

        try{
            message=exchanger.exchange(message);
            System.out.println("PutThread get: " + message);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}