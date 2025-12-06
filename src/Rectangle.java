public class Rectangle extends Shape{
    private double width;
    private double height;

    public void setWidthHeight(double width, double height){
        this.height = height;
        this.width = width;
    }

    @Override
    public double area(){
        return width*height;
    }
}
