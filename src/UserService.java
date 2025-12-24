public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    void reg(User user){
        userRepository.save(user);
    }
}
