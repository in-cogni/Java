public abstract class Notification{
    private String recipient;
    public Notification(String recipient){
        this.recipient = recipient;
    }
    public abstract void send();
    public void printInfo(){
        System.out.println("Получатель: " + recipient);
    }
}