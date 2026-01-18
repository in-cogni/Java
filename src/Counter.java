import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Counter {
    private int value = 0;
    private final Lock lock = new ReentrantLock();

    /*public synchronized void increment(){
        value++;
    }*/
    //or
    public void increment(){
       lock.lock();
       try {
           value++;
       }
       finally {
           lock.unlock();
       }
    }

    public int getValue(){
        lock.lock();
        try{
            return value;
        }finally {
            lock.unlock();
        }
    }
}
