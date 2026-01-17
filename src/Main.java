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
//static int counter = 0;
void main() throws InterruptedException{
    //без потоков:
    /*for(int i=0; i<=5;i++){
        System.out.println(i);
    }
    for(char c= 'A'; c<='E';c++){
        System.out.println(c);
    }*/

    //с потоками:
    /*Thread num = new Thread(()->{
        for(int i=0; i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                //
            }
        }
    });
    Thread letters = new Thread(()->{
        for(char c= 'A'; c<='E';c++){
            System.out.println(c);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                //
            }
        }
    });
    num.start();
    letters.start();*/

    //1 вариант: неудобен, тк класс наследуется от потока и больше не может наследоваться extends
    /*HelloThread thread = new HelloThread();
    thread.start();
    System.out.println("Main thread closed");*/

    //2 вариант: класс наследуется от интерфейса и в дальшем может наследоваться от extends
    /*Runnable runnable = new HelloThread();
    Thread thread= new Thread(runnable);
    thread.start();
    System.out.println("Main thread closed");*/

    //3 вариант: без создания отдельного класса
    /*Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Anonim class Thread "+ Thread.currentThread().getName());
        }
    });
    thread.start();
    System.out.println("Main thread closed");*/

    /*Thread thread = new Thread(()->{
        System.out.println("run() for thread "+ Thread.currentThread().getName());
    });
    thread.run();//в main
    thread.start();//новый поток*/

    /*Thread thread = new Thread(()->{
        System.out.println("Worked...");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        System.out.println("Done");
    });
    thread.start();
    System.out.println("Wait thread ...");
    try{
        thread.join();
    }catch (InterruptedException e){}
    System.out.println("Thread closed");*/

    /*Thread thread = new Thread(()->{
        while(!Thread.currentThread().isInterrupted()){
            //work
        }
        System.out.println("Поток завершен по прерыванию");
    });
    thread.start();
    thread.interrupt();*/

    /*Thread t = new Thread(()->{
        System.out.println("hello");
    });
    System.out.println(t.getState());
    t.start();
    System.out.println(t.getState());
    try{
        t.join();
    }catch (InterruptedException e){}
    System.out.println(t.getState());*/

    /*Thread t = new Thread(()->{
        try{
            System.out.println("Sleep");
            Thread.sleep(1000);//TIME_WAITING
            System.out.println("Wake up");
        }catch (InterruptedException e){
            System.out.println("Canceled");
        }
    });
    System.out.println(t.getState());
    t.start();
    System.out.println(t.getState());*/

    /*int threads = 1000;
    Thread[] threadArray = new Thread[threads];
    for(int i=0;i<threads;i++) {
        threadArray[i]=new Thread(()->{
            counter++;
        });
        threadArray[i].start();
    }
    for(int i=0;i<threads;i++){
        threadArray[i].join();
    }
    System.out.println("Wait "+threads);//Ожидалось
    System.out.println("Count "+counter);//Получили*/

    Counter counter = new Counter();
    Thread t1 = new Thread(()->{
        for(int i=0; i<10000; i++){
            counter.increment();
        }
    });
    Thread t2= new Thread(()->{
        for(int i=0; i<10000; i++){
            counter.increment();
        }
    });
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(counter.count);
}



