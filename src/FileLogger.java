public class FileLogger implements Logger{//public
    @Override
    public void log(String msg) {//public
        System.out.println("FILE: " + msg);
    }
}
