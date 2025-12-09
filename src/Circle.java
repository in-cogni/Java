public class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Рисуем круг");
    }

    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
