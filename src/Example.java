public class Example {
    String name = "Outside class";

    void demo(){
        Runnable r1 = new Runnable() {
            String name = "Anonim class";
            @Override
            public void run() {
                System.out.println(this.name);
            }
        };
        Runnable r2 = ()-> System.out.println(this.name);
        r1.run();
        r2.run();
    }
}
