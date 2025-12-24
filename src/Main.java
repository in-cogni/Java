void main() {
    //1
    List<Playable> list = new ArrayList<>();
    list.add(new MusicPlayer());
    list.add(new VideoPlayer());

    for(Playable playable: list){
        playable.play();
    }
    //2
    List<Validator> validators = new ArrayList<>();
    validators.add(new EmailValidator());
    validators.add(new PasswordValidator());

    System.out.println("Email 'string': "+validators.get(0).isValid("string"));//false
    System.out.println("Email 'string@tut.ru': "+validators.get(0).isValid("string@tut.ru"));//true
    System.out.println("Password '9ij j': "+validators.get(1).isValid("9ij j"));//false
    System.out.println("Password '09oijkKh': "+validators.get(1).isValid("09oijkKh"));//true
}
