void main() {
    //1
    List<Integer> list = List.of(1, 2, 3, 4);
    int result = 0;
    List<Integer> resultList = list.stream()
            .filter(s->s%2==0)
            .map(s->s*s)
            .collect(Collectors.toList());
    System.out.println(resultList);
    System.out.println(resultList.stream().mapToInt(Integer::intValue).sum());

    //2
    List<Person> person = List.of(
            new Person("Mike", "New-York", 34),
            new Person("Joe", "Panama", 29),
            new Person("Joe", "Panama", 21),
            new Person("Joe", "LA", 12),
            new Person("Jimmy", "Moscow", 9)
    );

    Map<String, Double> filtered = person.stream()
            .filter(s->s.age>18)
            .collect(Collectors.groupingBy(
                    p->p.city,
                    Collectors.averagingDouble(p->p.age)
            ));
    System.out.println(filtered);

}