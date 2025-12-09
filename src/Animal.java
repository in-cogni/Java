public abstract class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }
    public abstract void makeSound();

    public void sleep(){//обычный метод
        System.out.println(name+"ZZZZ");
    }
}
