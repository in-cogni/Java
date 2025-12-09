public abstract class Figure {
    double x;
    double y;

    public Figure(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void moveTo(double newX, double newY){
        x = newX;
        y = newY;

        System.out.println("Figure move to "+x+", "+y);
    }

    public abstract  void draw();
}
