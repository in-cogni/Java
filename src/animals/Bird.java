package animals;

import java.util.ArrayList;
import java.util.List;

public class Bird {
    /*public void fly(double x){
        System.out.println("double "+x);
    }

    public void fly(int x){
        System.out.println("int "+x);
    }*/
    private double balance;
    protected void sleep(){}

    public void setBalance(double balance) {
        if(balance<0){
            throw new IllegalArgumentException();
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getMember(){
        return new ArrayList<>();
    }
}
