public class User { //public
    //private поля
    private String name;
    private int age;

    //нет геттеров, сеттеров

    public void setName(String name) {
        if(name==null||name.isEmpty()){
            throw new IllegalArgumentException("name is empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("age<0");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

