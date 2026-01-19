import java.sql.SQLOutput;

public class Printer {
    public synchronized void print(String text){
        for(char c: text.toCharArray()){
            System.out.print(c);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.getMessage();
            }
        }
        System.out.println();
    }

}
