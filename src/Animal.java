public class Animal {
    String name;

    /*public Animal(String name){
        this.name = name;
        System.out.println("123");
    }*/

    void makeSound(){
        System.out.println("Some sound");
    }

    void sleep(){
        System.out.println("Animal is sleep");
        makeSound();
    }

    void eat(){
        System.out.println("Кушает");
    }
}
