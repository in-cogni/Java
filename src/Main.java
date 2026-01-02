void main() {
    //1
    Scanner in = new Scanner(System.in);
    try{
        System.out.println("Введите число");
        int a = in.nextInt();
        if(a==0){
            throw new ArithmeticException();
        }
        float b = 100/a;
        System.out.println("Результат: "+b);
    }catch (ArithmeticException | InputMismatchException e){
        System.out.println("Ошибка "+e.getMessage());
    }
    finally{
        System.out.println("Программа завершила работу");
        in.close();
    }

    //2
    try{
        int age = parseAge("k");
        System.out.println("Возраст: "+age);
    }catch (NumberFormatException e){
        System.out.println(e.getMessage());
    }catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
    }

    //3
    System.out.println("Попытка 1: ");
    try{
        BankAccount bankAccount = new BankAccount("", 10);
        bankAccount.withdraw(1);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }

    System.out.println("Попытка 2: ");
    try {
        BankAccount bankAccount = new BankAccount("User", 1000);
        bankAccount.withdraw(0);
    }catch (Exception e){
        System.out.println(e.getMessage());
    }

    System.out.println("Попытка 3: ");
    try {
        BankAccount bankAccount = new BankAccount("User", 1000);
        bankAccount.withdraw(1500);
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
}
//2
public static int parseAge(String input) throws NumberFormatException, IllegalArgumentException {
    int age = Integer.parseInt(input);
    if (age < 0 | age > 150) {
        throw new IllegalArgumentException("Возраст не может быть меньше 0 или больше 150");
    }
    return age;
}
