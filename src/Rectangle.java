public class Rectangle implements Shape{//public
    //private поля
    private int width;
    private int height;

    public Rectangle(int height, int width) {
        if(height<=0){
            throw new IllegalArgumentException("height<=0");
        }
        if(width<=0){
            throw new IllegalArgumentException("width<=0");
        }
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public int area() {//public
        return width * height;
    }
}
