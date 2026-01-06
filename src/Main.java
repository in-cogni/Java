void main() {
    //В исходном коде изменение одной стороны квадрата влияет на другую - это изменяет поведение базового класса
    /*Rectangle rect = new Square();
    rect.width = 3;
    rect.height = 2;//width тоже меняется на 2
    rect.area();//4, но ожидаем 6*/

    Shape rectangle = new Rectangle(5, 9);
    Shape square = new Square(8);

    System.out.println(rectangle.area());
    System.out.println(square.area());
}