//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    Student student = new Student();
//    student.setName("Anna");
//    student.setAge(10);
//    System.out.println(student.getName());
//
//    Thread.sleep();

    //Thermometer thermometer = new Thermometer();
    //thermometer.setTemperature(-100.0);
    //thermometer.setTemperature(20);

    //System.out.println("Текущая температура: "+thermometer.getTemperature());

    Product product = new Product("Товар1", 10);
    product.setPrice(100);

    System.out.println("Название: "+product.getName());
    System.out.println("Кол-во: "+product.getQuantity());
    System.out.println("Цена: "+product.getPrice());

    System.out.println("totalCost: "+product.totalCost());

    product.setPrice(-20);
    System.out.println("Цена: "+ product.getPrice());
    System.out.println("totalCost: "+product.totalCost());
}
