public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "Безымянный";
        this.age = 18;
    }

    void sayHello() {
        System.out.println("Hello " + name);
    }

    public int getAge() {
        return age;
    }

    public void heveDirthday() {
        age++;
        System.out.println("Now you "+age);
    }
}
