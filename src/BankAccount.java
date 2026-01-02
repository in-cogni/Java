public class BankAccount {
    private String owner;
    private float balance;
    public BankAccount(String owner, float balance)throws InvalidAccountException{
        if(owner == null || owner.isEmpty()){
            throw new InvalidAccountException("Владелец счета не может быть пустым");
        }
        this.owner = owner;

        if(balance<0){
            throw new InvalidAccountException("Начальный баланс не может быть отрицательным");
        }
        this.balance = balance;
    }

    public void withdraw(double amount) throws InvalidAccountException{
        if(amount<=0){
            throw new IllegalArgumentException("Amount должен быть больше 0");
        }
        if(amount > balance){
            throw new InvalidAccountException("Amount больше баланса");
        }

        balance -= amount;
    }
}
