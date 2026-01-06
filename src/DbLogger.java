public class DbLogger implements Logger{//public
    @Override
    public void log(String msg) {//public
        System.out.println("DB: " + msg);
    }
}
