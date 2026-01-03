void main() {
    /*Product client1 = new Product("Victor", 25);
    Product client = new Product("Victor", 25);
    System.out.println(client.name());
    System.out.println(client.price());
    System.out.println(client);
    System.out.println(client.equals(client1));
    System.out.println(client.hashCode() == client1.hashCode());
    System.out.println(client);*/

    /*Map<Product, String> clients = new HashMap<>();
    clients.put(new Product("Anna", 25), "VIP");
    System.out.println(clients.get(new Product("Anna", 25)));*/

    /*int[] arr = {1, 2, 3};
    int[] copy = Arrays.copyOf(arr, arr.length);
    DataHolder dataHolder = new DataHolder(arr);
    arr[0]=99;
    System.out.println(dataHolder.data()[0]);*/

    /*record PointA(int a, int b){}
    Map<PointA, String> map = new HashMap<>();*/

    /*Map<Point, String> map = new HashMap<>();
    Point p1 = new Point(3, 4);
    map.put(p1, "Hello");
    Point p2 = new Point(3, 4);
    System.out.println(map.get(p2));*/

    Point p1 = new Point(0, 0);
    Point p2 = new Point(3, 4);
    Point p3 = new Point(2, 4);

    System.out.println(p1.equals(p3));
    System.out.println(p1.equals(p2));

    System.out.println(p1.hashCode());
    System.out.println(p2.hashCode());
    System.out.println(p3.hashCode());

    System.out.println(p3);

    System.out.println(p1.distanceTo(p2));
}
