import javax.xml.crypto.Data;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.List;
void main(){
    MyAction action = ()-> System.out.println("Hello");
    action.run();

    //Predicate
    //Consumer
    //Supplier
    //Function

    Predicate<String> isLong = s->s.length()>5;
    System.out.println(isLong.test("Java"));
    System.out.println(isLong.test("Hello6"));

    Consumer<String> printer = s-> System.out.println("Printing"+s);
    printer.accept("Java");

    Supplier<Double> randomSup = ()->Math.random();
    System.out.println(randomSup.get());

    Function<String, Integer> stringToLength = s->s.length();
    System.out.println(stringToLength.apply("Hello"));

    //UnaryOperator
    //BiFunctions

    //List<String> words = List.of("java", "", "stream", "lambda", "code");
    List<String> words = new ArrayList<>(Arrays.asList( "", "stream", "lambda", "code"));
    List<String> longWords = words.stream()
            .filter(word->word.length()>4)
            .toList();
    System.out.println(longWords);

    Predicate<String> isShort = s->s.length()<5;

    //(параметры)->{тело}
    //(a, b)->{a+b};

    Runnable r = ()-> System.out.println("Hello");
    r.run();

    Consumer<String> print = s-> System.out.println(s);
    print.accept("Jaava");

    Function<Integer, Integer> abc = x->{
        if(x<0){
            return -x;
        }
        return x;
    };
    System.out.println(abc.apply(-3));

    Thread t = new Thread(()-> System.out.println("Start"));
    t.start();

    List<String> longWord = words.stream()
            .filter(s->s.length()>5)
            .collect(Collectors.toList());
    System.out.println(longWord);

    String name = "Java";

    Example example = new Example();

    words.forEach(s-> System.out.println(s));
    words.forEach(System.out::println);
    words.removeIf(s->s.isEmpty());
    System.out.println(words);

    words.stream()
            .filter(s->s.length()>3)
            .forEach(System.out::println);

    List<String> upper = words.stream()
            .map(s->s.toUpperCase())
            .collect(Collectors.toList());
    System.out.println(upper);

}



