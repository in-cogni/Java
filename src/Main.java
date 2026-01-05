void main() {
    //1
    List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
    List<Integer> numsStream = nums.stream()
            .filter(n->n%2!=0)
            .map(n->n*2)
            .collect(Collectors.toList());
    System.out.println(numsStream);//2 6 10

    //2
    List<String> words = List.of("java", "python", "go", "java", "rust", "go");
    List<String> wordsStream = words.stream()
            .distinct()
            .filter(n->n.length()>3)
            .sorted()
            .collect(Collectors.toList());
    System.out.println(wordsStream);

    //3
    List<User> users = List.of(
            new User("Bob", 17),
            new User("Mila", 22),
            new User("Ilya", 31),
            new User("Anna", 17)
    );
    Map<Integer, List<User>> usersStream = users.stream()
            .collect(Collectors.groupingBy(User::age));
    System.out.println(usersStream);

    //дальше тяжело

}