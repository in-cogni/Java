public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, int quantity){
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        else{
            this.name = name;
        }
        if(quantity < 0){
            throw new IllegalArgumentException("Кол-во должно быть > 0");
        }
        else{
            this.quantity = quantity;
            this.price = 0.0;
        }
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Цена не может быть отрицательной");
        } else {
            this.price = price;
        }
    }

    public double totalCost() {
        return this.price * this.quantity;
    }
}
