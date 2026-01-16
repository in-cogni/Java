import java.util.EventListener;
import java.util.EventObject;

public interface DataLoadedListener extends EventListener {
    void dataLoaded(DataLoadEvent event);
}
