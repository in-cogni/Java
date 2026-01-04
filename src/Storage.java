import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Storage<T> {
    private ArrayList<T> items = new ArrayList<>();
    private LinkedList<T> history = new LinkedList<>();

    public LinkedList<T> getHistory(){
        return history;
    }

    public void add(T element){
        items.add(element);
        history.add((T)("add: <"+element+">"));
    }

    public boolean remove(T element){
        boolean isRemoved = items.remove(element);
        if(isRemoved) {
            history.add((T) ("removed: <" + element + ">"));
        }
        return isRemoved;
    }

    public HashMap<T, Integer> statistics(){
        HashMap<T, Integer> map = new HashMap<>();
        for(T item: items){
            map.put(item, map.getOrDefault(item, 0)+1);
        }
        return map;
    }
}
