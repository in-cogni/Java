void main() {
    //1
    Path path = Paths.get("simple.txt");
    List<String> data = Arrays.asList(
            "string"
    );
    try{
        Files.write(path, data, StandardOpenOption.CREATE);
    }catch (IOException e){
        System.out.println(e.getMessage());
    }

    //2
    Path path1 =Paths.get("log.txt");
    try{
        Files.write(path1, data, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }catch (IOException e){
        System.out.println(e.getMessage());
    }

    //3
    Path path2 = Paths.get("report.txt");
    try{
        if(Files.exists(path2)){
            throw new IOException("Файл report.txt уже существует");
        }
        Files.write(path2, data, StandardOpenOption.CREATE_NEW);
    }catch (IOException e){
        System.out.println(e.getMessage());
    }
}