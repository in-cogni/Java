//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Person lada = new Person("Lada", 17);
    Person katya = new Person("Vasya", 38);
    Person vitya = new Person();
    Person anotherLada = lada;
    /*lada.name = "Lada Kashubo";
    lada.age = 17;
    lada.sayHello();

    katya.name = "Katerina";
    katya.age = 19;
    katya.sayHello();*/
    lada.sayHello();
    lada.heveDirthday();
    vitya.sayHello();
}
