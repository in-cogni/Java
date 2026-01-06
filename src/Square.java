public class Square implements Shape{
    private int side;

    public Square(int side) {
        if(side<=0){
            throw new IllegalArgumentException("side<=0");
        }
        this.side = side;
    }

    @Override
    public int area(){
        return side*side;
    }
}
