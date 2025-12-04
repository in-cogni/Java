public class Cat extends Animal{

    /*public Cat(String name){
        super(name);
        System.out.println("Cat 123");
    }*/



    //пишем override если метод перегружен
    @Override
    void eat(){
        System.out.println("Котик eat");
        super.eat();//вызывается eat у Animal
        System.out.println("Котик eat");
    }

    void meow(){
        System.out.println(name);
    }
}
