void main() {
    List<String> list = Arrays.asList(
            "this is a new text",
            "joe",
            "0point",
            "apple strawberry",
            "0123456789",
            "01234567890");

    //1
    Path path = Paths.get("input.txt");
    String filename = "input.txt";

    try{
        Files.write(path, list, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }catch (IOException e){
        System.out.println("Error "+e.getMessage());
    }

    try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
        String line;
        int number=1;
        while((line = reader.readLine())!=null){
            System.out.printf("%3d: %s%n",number, line);
            number++;
        }
    }catch (IOException e){
        System.out.println("Error "+e.getMessage());
    }

    //2
    String filename1 = "source.txt";
    String filename2 = "result.txt";
    Path path1 = Paths.get(filename1);
    Path path2 = Paths.get(filename2);
    try{
        Files.write(path1, list, StandardOpenOption.CREATE);
        if(!Files.exists(path2)){
            Files.createFile(path2);
        }
    }catch (IOException e){
        System.out.println("Error "+e.getMessage());
    }

    try(BufferedReader reader = new BufferedReader(new FileReader(filename1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename2))){
        String line;
        while ((line=reader.readLine())!=null){
            System.out.println("{size: "+line.length()+"} "+line);
            if(line.length()>10){
                writer.write(line);
                writer.newLine();
            }
        }

    }catch (IOException e){
        System.out.println("Error "+e.getMessage());
    }

    //3
    String filename3 = "data.bin";
    String filename4 = "stats.txt";
    int totalBytes=0;
    int zeroBytes = 0;
    try(FileInputStream in = new FileInputStream(filename3);
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename4))){
        int bytes;
        while ((bytes=in.read())!=-1){
            totalBytes++;
            if(bytes==0){
                zeroBytes++;
            }
        }
        writer.write("Total bytes: "+totalBytes);
        writer.newLine();
        writer.write("Zero bytes: "+zeroBytes);
    }catch (IOException e){
        System.out.println("Error "+e.getMessage());
    }
}