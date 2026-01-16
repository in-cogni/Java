import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    List<DataLoadedListener> listeners = new ArrayList<>();

    public void addDataLoaded(DataLoadedListener listener){
        listeners.add(listener);
    }

    public void removeDataLoader(DataLoadedListener listener){
        listeners.remove(listener);
    }

    private void fireDataLoaded(String data){
        DataLoadEvent event = new DataLoadEvent(this, data);
        for(DataLoadedListener listener: listeners){
            listener.dataLoaded(event);
        }
    }

    public void loadData(){
        String loadedData = "Это загруженные данные";
        System.out.println(loadedData);

        fireDataLoaded(loadedData);
    }

}
