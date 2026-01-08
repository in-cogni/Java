import javax.xml.crypto.Data;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.List;
void main(){
    /*try(FileReader reader = new FileReader("")){
        int c;
        while((c=reader.read())!=-1){

        }
    }*/
    /*String filename = "output.txt";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter string");
    String entry = scanner.nextLine();*/

    /*//try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))){//true - означает добавлять новое, не перезаписывать
    try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true), 7655)){
    //try(BufferedWriter writer = new BufferedWriter (new OutputStreamWriter(new FileOutputStream(filename), "UTF-8"))){
        writer.write(entry);
        writer.newLine();
        System.out.println("Ok");
        writer.flush();
    }catch(IOException e){
        System.out.println("Error "+e.getMessage());
    }*/

    /*Path path = Path.of(filename);
    try{
        //маленькие и средние файлы. список строк
        List<String> lines = Files.readAllLines(path);
        for(int i=0; i<lines.size();i++){
            System.out.printf("%3d: %s%n", i+1, lines.get(i));
        }
        //маленькие файлы и нужен весь текст(нет разбивки на строки)
        String content = Files.readString(path, StandardCharsets.UTF_8);
        System.out.println(content);
    }catch (IOException e){
        System.out.println("Error "+e.getMessage());
    }*/
//большие файлы, чтение по строкам
    /*try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
        String line;
        int lineNumber = 1;
        while((line=reader.readLine())!=null){
            System.out.printf("%3d: %s%n", lineNumber, line);
            lineNumber++;
        }
    }catch(IOException e){
        System.out.println("Error "+e.getMessage());
    }*/

    /*String source = "smesharick.jpg";
    String dest = "smesharick_copy.jpg";
    try(FileInputStream in = new FileInputStream(source);
        FileOutputStream out = new FileOutputStream(dest)){
        byte[] buffer = new byte[8192];
        int bytesRead;
        while((bytesRead=in.read(buffer))!=-1){
            out.write(buffer, 0, bytesRead);
        }
        System.out.println("Ok");
    }catch (IOException e){
        System.out.println("Error "+e.getMessage());
    }*/

    String filename = "savegame.bin";
    /*String playerName = "Alex";
    int score = 12345;
    double recordTime = 67.5;
    boolean isWinner = true;

    try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))){
        dos.writeUTF(playerName);
        dos.writeInt(score);
        dos.writeDouble(recordTime);
        dos.writeBoolean(isWinner);
        System.out.println("Ok");
    }catch (IOException e){
        System.out.println("Error "+e.getMessage());
    }*/

    try(DataInputStream dis = new DataInputStream(new FileInputStream(filename))){
        String playerName = dis.readUTF();
        int score = dis.readInt();
        double recordTime = dis.readDouble();
        boolean isWinner = dis.readBoolean();
        System.out.println(playerName);
        System.out.println(score);
        System.out.println(recordTime);
        System.out.println(isWinner);
    }catch (IOException e){
        System.out.println("Error "+e.getMessage());
    }
}
