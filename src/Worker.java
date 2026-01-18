public class Worker extends Thread{
    private volatile boolean running = true;

    public void run(){
        while(running){
            //
        }
        System.out.println("Поток завершен");
    }

    public void shutdown(){
        running = false;
    }
}
