package LessonThread.Synchronized.ExchangerUsage;

import java.util.concurrent.Exchanger;

public class GetThread implements Runnable{

    Exchanger<String> exchanger;
    String message;

    GetThread(Exchanger ex){

        this.exchanger=ex;
        message = "Agree!";
    }
    public void run(){

        try{
            message=exchanger.exchange(message);
            System.out.println("GetThread get: " + message);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}