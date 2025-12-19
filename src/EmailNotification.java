public class EmailNotification extends Notification{
    private String email;
    public EmailNotification(String recipient, String email){
        super(recipient);
        this.email = email;
    }
    @Override
    public void send(){
        System.out.println("Отправка email на: "+ email);
    }
}