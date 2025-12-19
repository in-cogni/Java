public class Monkey extends ZooAnimal{
    public Monkey(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name+": Ууу-ааа!");
    }
}
