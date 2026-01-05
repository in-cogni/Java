void main() {
    /*List<User> users = new ArrayList<>();
    List<String> userList = new ArrayList<>();
    for(User user: users){
        if(user.getAge()>18){
            userList.add(user.getName());
        }
    }*/
    /*List<User> users = new ArrayList<>();
    List<String> userList = users.stream()
            .filter(user -> user.getAge()>=18)
            .map(User::getName)
            .collect(Collectors.toList());*/

    /*List<String> names = List.of("Anna", "Boris", "Elena", "Alina");
    Stream<String> stream = names.stream();

    int[] nam = {1,2,3,4,5};
    IntStream intStream = Arrays.stream(nam);*/

    List<String> names = List.of("Anna", "Boris", "Elena", "Alina", "Elena");
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    List<Integer> evenNum = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
    System.out.println(evenNum);
    List<String> evenNames = names.stream()
            .filter(name -> name.startsWith("A"))
            .collect(Collectors.toList());
    System.out.println(evenNames);
    List<Integer> evenName = names.stream()
            .map(name -> name.length())
            .collect(Collectors.toList());
    System.out.println(evenName);
    List<String> evenNameUp = names.stream()
            .map(name -> name.toUpperCase())
            .collect(Collectors.toList());
    System.out.println(evenNameUp);
    String evenNameU = names.stream()
            .map(name -> name.toUpperCase())
            .collect(Collectors.joining(", "));
    System.out.println(evenNameU);
    List<Integer> evenN = names.stream()
            .filter(name->name.startsWith("A"))
            .map(String::length)
            .collect(Collectors.toList());
    System.out.println(evenN);

    List<String> unique = names.stream()
            .distinct()
            .collect(Collectors.toList());
    System.out.println(unique);

    List<User> users =  List.of(
            new User("Anna", "ann@gmail.com"),
            new User("Joe", "1joe3@gmail.com"),
            new User("Robin", "robin123@gmail.com"),
            new User("Nancy", "123x@gmail.com"),
            new User("Nancy2", "123x@gmail.com")
    );

    List<User> userList = users.stream()
            .distinct()
            .collect(Collectors.toList());
    System.out.println(userList);

    List<User> userListL = users.stream()
            .limit(3)
            .collect(Collectors.toList());
    System.out.println(userListL);

    List<User> userListS = users.stream()
            .sorted(Comparator.comparingInt(u->u.email.length()))
            .limit(2)
            .collect(Collectors.toList());
    userListS.forEach(System.out::println);
    //System.out.println(userListS);

    List<String> evenNumS = names.stream()
            .skip(2)
            .collect(Collectors.toList());
    System.out.println(evenNumS);

    System.out.println(names.stream()
            .filter(name->name.startsWith("A"))
            .peek(e -> System.out.println("Filtered value: "+e))
            .map(String::toUpperCase)
            .collect(Collectors.toList())
    );
}
