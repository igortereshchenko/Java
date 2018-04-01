package LessonThread.Synchronized.PhaserUsage;

import java.util.concurrent.Phaser;

public class PhaseThread implements Runnable{

    Phaser phaser;
    String name;

    PhaseThread(Phaser p, String n){

        this.phaser=p;
        this.name=n;
        phaser.register();
    }
    public void run(){

        System.out.println(name + " phase " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance();

        try{
            Thread.sleep(200);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(name + " phase " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance();

        try{
            Thread.sleep(200);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(name + " phase " + phaser.getPhase());
        phaser.arriveAndDeregister();
    }
}