import com.sun.source.tree.Tree;

void main() {
    //без коллекции
    /*String [] students = new String[3];
    students[0]="";
    students[1]="";
    students[2]="";

    String[] newS = new String[4];
    for(int i = 0;i< students.length; i++){
        newS[i]=students[i];
    }
    newS[3]="";
    students=newS;*/

    //коллекция
    /*List<String> students = new ArrayList<>();
    students.add("vasya");
    students.add("anna");
    students.add(1, "petya");

    System.out.println(students);
    String first = students.get(0);
    students.set(1, "Pavel");
    students.remove("Anna");
    System.out.println(students.size());*/

    /*List<String> students = new LinkedList<>();
    students.add("vasya");
    students.add("anna");
    students.add(1, "petya");
    System.out.println(students);
    students.remove(1);
    System.out.println(students);*/

    Map<String, Integer> ages = new HashMap<>();
    ages.put("Vasya", 25);
    ages.put("Petya", 5);
    ages.put("Masha", 22);

    int age = ages.get("Vasya");
    System.out.println(age);

    if (ages.containsKey("Masha")) {
        System.out.println("Masha is here");
    }
    ages.remove("Petya");
    for (String name : ages.keySet()) {
        System.out.println(name + ": " + ages.get(name));
    }

    for (Map.Entry<String, Integer> entry : ages.entrySet()) {

    }

    //Map<String, Integer> ages = new TreeMap<>();//хранит элементы в отсортированном порядке по ключу

    /*Set<String> guests = new HashSet<>();
    guests.add("Anton");
    guests.add("Yaroslav");
    guests.add("Luca");
    guests.add("Boris");
    guests.add("Max");
    for(String task: guests){
        System.out.println("- "+task);
    }*/

    Set<String> guests = new TreeSet<>();
    guests.add("Anton");
    guests.add("Yaroslav");
    guests.add("Luca");
    guests.add("Boris");
    guests.add("Max");
    for (String task : guests) {
        System.out.println("- " + task);
    }

    /*List list = new ArrayList();//без дженериков
    list.add("Privet");
    list.add(42);
    list.add(new Object());

    String s = (String) list.get(1);//error
    System.out.println(s);*/

    List<String> list = new ArrayList<>();//с дженериками
    list.add("Privet");

    Box<String> stringBox = new Box<>();
    System.out.println(stringBox.get());

    Box<Integer> integerBox = new Box<>();
}
