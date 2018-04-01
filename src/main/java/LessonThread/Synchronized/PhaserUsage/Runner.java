package LessonThread.Synchronized.PhaserUsage;

import LessonThread.Synchronized.ExchangerUsage.GetThread;
import LessonThread.Synchronized.ExchangerUsage.PutThread;

import java.util.concurrent.Exchanger;
import java.util.concurrent.Phaser;

public class Runner {

    public static void main(String[] args){
        Phaser phaser = new Phaser(1);
        new Thread(new PhaseThread(phaser, "PhaseThread 1")).start();
        new Thread(new PhaseThread(phaser, "PhaseThread 2")).start();


        int phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();

        System.out.println("Phase " + phase + " end");



        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();

        System.out.println("Phase " + phase + " end");


        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();

        System.out.println("Phase " + phase + " end");

        phaser.arriveAndDeregister();
    }
}
