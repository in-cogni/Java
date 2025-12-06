
void main() {
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Shape shape = new Shape();

    circle.setRadius(2.0);
    rectangle.setWidthHeight(3.0, 1.0);

    Shape[] shapes = {
            circle,
            rectangle,
            shape
    };

    for(Shape s: shapes){
        System.out.println("Площадь: " + s.area());
    }

    ShapeUtils shapeUtils = new ShapeUtils();
    shapeUtils.printArea(circle);
    shapeUtils.printArea(rectangle);
    shapeUtils.printArea(shape);
}
