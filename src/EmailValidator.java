public class EmailValidator implements Validator{
    @Override
    public boolean isValid(String input){
        if(input==null){
            return false;
        }
        if(!input.contains("@")){
            return false;
        }
        String str = input.substring(input.indexOf('@')+1);
        return str.contains(".");
    }
}
