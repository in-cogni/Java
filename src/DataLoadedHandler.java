public class DataLoadedHandler implements DataLoadedListener{
    @Override
    public void dataLoaded(DataLoadEvent event){
        System.out.println(event.getData());
    }
}
