import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

void main() throws InterruptedException {
    //1
    /*Printer printer = new Printer();

    Runnable printTask = new Runnable() {
        @Override
        public void run() {
            printer.print("Message for threads");
        }
    };
    Thread t1 = new Thread(printTask);
    Thread t2 = new Thread(printTask);
    t1.start();
    t2.start();*/

    //2
    Stop stop = new Stop();
    Thread t3 = new Thread(new Runnable() {
        @Override
        public void run() {
            while(stop.running){
                System.out.println("t3 is working");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Stopped");
        }
    });

    Thread t4 = new Thread(new Runnable() {
        @Override
        public void run() {
            try{
                Thread.sleep(5000);
                stop.running = false;
                System.out.println("Stop");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    });

    t3.start();
    t4.start();

    t3.join();
    t4.join();
}