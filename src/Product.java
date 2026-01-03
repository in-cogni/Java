public record Product(String name, double price) {
    public Product{
        if(name == null || name.isEmpty()){
            throw  new IllegalArgumentException("Name не может быть пустым");
        }
        if(price < 0){
            throw  new IllegalArgumentException("Price не может быть отрицательной");
        }
    }
}
