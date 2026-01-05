import java.util.Objects;

public class User {
    String name;
    String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o==null||getClass()!=o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString(){
        return "{"+name+" "+email+"}";
    }

}
