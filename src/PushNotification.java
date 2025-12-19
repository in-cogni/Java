public class PushNotification extends Notification{
    private String deviceld;
    public PushNotification(String recipient, String deviceld){
        super(recipient);
        this. deviceld = deviceld;
    }
    @Override
    public void send(){
        System.out.println("Push на устройство:" + deviceld);
    }
}