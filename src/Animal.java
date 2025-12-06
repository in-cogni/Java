public class Animal {

    void makeSound(){
        System.out.println("Some sound");
    }

    void makeSound(String name){
        System.out.println("Some sound "+name);
    }

    /*void sleep(){
        System.out.println("Animal is sleep");
        makeSound();
    }

    void eat(){
        System.out.println("Кушает");
    }*/

    void printAll(String... messages){
        for(String msg: messages){
            System.out.println(msg);
        }
    }
}
