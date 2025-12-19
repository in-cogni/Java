public class Elephant extends ZooAnimal{
    public Elephant(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name+": Трууу!");
    }
}
