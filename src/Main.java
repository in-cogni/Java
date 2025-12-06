void main() {
    /*Animal[] animals = {
            new Cat(),
            new Dog()
    };
    Animal animal1 = new Cat();
    Animal animal2 = new Dog();
    animal1.makeSound();
    animal2.makeSound();
    for(Animal animal: animals){
        animal.makeSound();
    }*/
    Animal animals = new Cat();
    /*if(animals instanceof Cat){
        ((Cat) animals).play();
    }*/
    animals.makeSound("Gav");
    animals.printAll("Hello");
    animals.printAll("Hello", "Cat");
    animals.printAll("Hello", "Cat", "Dog");
}
