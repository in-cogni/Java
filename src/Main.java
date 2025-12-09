void main() {
    /*Shape s1 = new Circle();
    Shape s2 = new Rectangle();

    s1.draw();
    s2.draw();*/

    /*Animal cat = new Cat("Barsic");
    cat.makeSound();
    cat.sleep();*/
    /*Shape[] shapes = {
            new Circle(5),
            new Circle(2.5)
    };*/
    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(5));
    shapes.add(new Circle(10));
    shapes.add(new Circle(15));
    for(Shape shape:shapes){
        shape.draw();
        System.out.println(shape.area());
    }
}
