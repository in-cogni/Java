public class Person {
    String name;
    String city;
    int age;

    public Person(String name, String city, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        this.name = name;

        if (city == null || city.isEmpty()) {
            throw new IllegalArgumentException("city is empty");
        }
        this.city = city;

        if(age<0) {
            throw new IllegalArgumentException("age <0");
        }
        this.age = age;
        }
}
