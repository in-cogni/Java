import java.sql.SQLException;

void main() {
    //Integer.parseInt("abc");
    /*int a = 10;
    int b = 0;*/
    /*try {
        int c = a/b;//AriphmeticException
        System.out.println(c);
        System.exit(0);//finally не выполнится!!! единственная ситуация
        int result=safeDivide(10,0);
        System.out.println(result);
        int result = parseAndDivide("42a", 2);
        System.out.println(result);
    } catch (ArithmeticException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }*/
    /*catch(IllegalArgumentException e){
        System.out.println("Ошибка "+e.getMessage());
    }
    finally {
        System.out.println("finally");
        //тут закрываются файлы, сетевые соединения
    }
    System.out.println("the end");*/

    /*int [] arr = {1, 2, 3};
    System.out.println(arr[10]);//uncheced exeption*/
    /*FileReader reader = null;
    try {
        reader = new FileReader("");
    }catch (FileNotFoundException e){
        throw new RuntimeException(e);
    }
    int data = reader.read();//checked exception*/
    /*int result = getValue();
    System.out.println(result);*/
    /*try{
        readFile("");
    }catch (FileNotFoundException e){
        throw new RuntimeException(e);
    }*/
    try {
        readFile();
    }catch(Exception e){
        throw new RuntimeException(e);
    }
}
public static int safeDivide(int a, int b){
    if(b == 0){
        throw new IllegalArgumentException("Ошибка на 0");
    }
    return a/b;
}

public static int parseAndDivide(String text, int div){
   try{
       int number = Integer.parseInt(text);
       if(div == 0){
           throw new IllegalArgumentException("Ошибка");
       }
       return number/div;
   }
   catch(NumberFormatException e){
       throw new IllegalArgumentException(text+" не является числом");
   }
   finally {
       System.out.println("Попытка обработки");
   }
}

public static int getValue(){
    try{
        return 10;
    }finally {
        System.out.println("Я выполнился");
    }
}
/*public static void readFile(String filename)throws FileNotFoundException, SQLException {
    FileReader reader = new FileReader(filename);
}*/
public static void readFile() throws Exception{
    int a = 10;
    int b = 0;
    int c = a/b;
}