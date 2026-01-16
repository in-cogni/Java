import java.util.EventObject;

public class DataLoadEvent extends EventObject {
    private final String data;

    public DataLoadEvent(Object source, String data) {
        super(source);
        this.data=data;
    }

    public String getData() {
        return data;
    }
}
