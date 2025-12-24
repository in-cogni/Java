public class Printer extends Machine implements Printable{
    @Override
    public void work(){
        System.out.println("Printer print");
    }
    @Override
    public void print(){
        System.out.println("Smart printer print");
    }
}
