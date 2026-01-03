public record Point(int x, int y) {
    /*@Override
    public String toString(){
        return "Точка{" +
                "x="+x+
                ", y="+y+
                "}";
    }*/
    public double distanceTo(Point other){
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
