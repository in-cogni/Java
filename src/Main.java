import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.List;
void main() throws InterruptedException{
    /*Counter counter = new Counter();
    Runnable incrementTask = ()->{
        for(int i=0;i<1000;i++){
            counter.increment();
        }
    };
    Thread t1 = new Thread(incrementTask);
    Thread t2 = new Thread(incrementTask);
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println("Ожидаемое 2000");
    System.out.println("Реальное "+counter.value);*/

    /*Worker w = new Worker();
    w.start();
    w.shutdown();*/

    ParkingLot parkingLot = new ParkingLot(3);
    for(int i=1;i<=5;i++){
        final String car = "car "+i;
        new Thread(()->{
            try{
                parkingLot.parkCar(car);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();
    }


}



