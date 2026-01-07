import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.List;
void main() throws IOException{
    /*//старый подход
    File file = new File("txt.txt");
    if(file.exists()){
        System.out.println("ok");
    }

    //современный подход
    Path path = Paths.get("txt.txt");
    if(Files.exists(path)){
        System.out.println("ok");
    }*/

    /*Path path = Paths.get("output.txt");
    List<String> lines = Files.readAllLines(path);
    for(String line: lines){
        System.out.println(line);
    }*/

    /*//переход от старой версии к новой:
    File file = new File("output.txt");
    Path path1 = file.toPath();
    File file1 = path1.toFile();
    if(Files.exists(path1)){
        System.out.println("ok"+Files.size(path1));
    }*/

    /*File file = new File("output.txt");
    File folder = new File("src");

    System.out.println(file.getAbsolutePath());
    System.out.println(file.exists());
    System.out.println(file.isFile());
    System.out.println(folder.isDirectory());
    System.out.println(folder.length());
    System.out.println(folder.getName());*/

    /*Path path1 = Paths.get("output.txt");
    Path path2 = Paths.get("folder", "file.txt");
    Path relative = path1.relativize(path2);
    System.out.println(path1.toAbsolutePath());
    System.out.println(path2.toAbsolutePath());
    System.out.println(relative);*/

    /*Path path1 = Paths.get("output.txt");
    System.out.println(Files.exists(path1));
    System.out.println(Files.isDirectory(path1));

    if(Files.exists(path1)){
        System.out.println("ok");
    }*/

    /*Path path1 = Paths.get("output.txt");
    List<String> lines = Files.readAllLines(path1, StandardCharsets.UTF_8);
    byte[] allBytes = Files.readAllBytes(path1);
    System.out.println(allBytes.length);
    System.out.println(lines);

    for(String line: lines){
        System.out.println(line);
    }*/

    /*Path path1 = Paths.get("output.txt");
    List<String> list = Arrays.asList(
            "C:\\Users\\Lenovo\\.jdks\\openjdk-25.0.1\\bin\\java.exe"
    );
    byte[] data = {1,2,3,4,5};
    Files.write(path1, data);
    Files.write(path1, list, StandardOpenOption.APPEND, StandardOpenOption.CREATE);//добавляет в конец и в случае отстутсвия файла создает его
    Files.write(path1, list, StandardOpenOption.APPEND, StandardOpenOption.CREATE_NEW);//создает файл всегда и добавляет в него текст
    Files.write(path1, list, StandardOpenOption.TRUNCATE_EXISTING);//очищает полностью
    System.out.println();*/

    //работа с очень большими файлами
    Path path1 = Paths.get("output.txt");
    try(BufferedReader reader = Files.newBufferedReader(path1)){
        String line;
        while((line = reader.readLine())!=null){
            System.out.println(line);
        }
    }
}
