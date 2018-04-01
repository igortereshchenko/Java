package LessonThread.Synchronized.ExchangerUsage;

import LessonThread.Synchronized.TwoThreadSynchronized.Resource;
import LessonThread.Synchronized.TwoThreadSynchronized.ThreadGet;
import LessonThread.Synchronized.TwoThreadSynchronized.ThreadPut;

import java.util.concurrent.Exchanger;

public class Runner {

    public static void main(String[] args){
        Exchanger<String> ex = new Exchanger();
        new Thread(new PutThread(ex)).start();
        new Thread(new GetThread(ex)).start();
    }
}
