public class PasswordValidator implements Validator{
    @Override
    public boolean isValid(String input){
        if(input==null){
            return false;
        }
        if(input.length()>=8){
            return true;
        }
        else return false;
    }
}
