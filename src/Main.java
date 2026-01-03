void main() {
    //1
    User user1 = new User("User1", 8);
    User user2 = new User("User2", 40);
    System.out.println(user1.equals(user2));
    System.out.println(user1);

    //2
    Product product = new Product("product", 100.0);
    System.out.println(product);

    try {
        Product product1 = new Product("", 10.0);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    try {
        Product product2 = new Product("product2", -10.0);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    //3
    List<OrderItem> list = new ArrayList<>();
    list.add(new OrderItem("product1", 10, 24.0));
    list.add(new OrderItem("product2", 4, 40.0));
    list.add(new OrderItem("product3", 8, 2.0));

    System.out.println("Общая стоимость: " + list.stream().mapToDouble(OrderItem::totalPrice).sum());
    System.out.println("Товар с максимальной суммой: "+ list.stream().max(Comparator.comparingDouble(OrderItem::totalPrice)).get());
}