void main() {
    //1
    List<ZooAnimal> animals = new ArrayList<>();
    animals.add(new Elephant("Слон"));
    animals.add(new Monkey("Обезьяна"));

    for(ZooAnimal animal: animals){
        animal.makeSound();
    }
    //2
    List<Notification> notifications = new ArrayList<>();
    notifications.add(new EmailNotification("Вася", "vasya@yandex.ru"));
    notifications.add(new PushNotification("Вася","192.168.0.66"));
    for(Notification notification: notifications){
        notification.printInfo();
        notification.send();
    }
}
