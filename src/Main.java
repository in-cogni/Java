void main() {
    //1
    String text = "This is the text. It is very entertaining. The end.";
    Map<String, Integer> words = new HashMap<>();
    String newText = text.toLowerCase(Locale.ROOT);
    String[] wordsArr = newText.split("[^a-z]+");

    for(String word: wordsArr){
        if(!word.isEmpty()){
            words.put(word, words.getOrDefault(word, 0)+1);
        }
    }

    Map<String, Integer> sorted = new TreeMap<>(words);

    System.out.println("Уникальные слова: ");
    for(String name: sorted.keySet()){
        System.out.print(name+" ");
    }
    System.out.println("\nКоличество уникальных слов: "+sorted.size());
    System.out.println(words);

    //2
    Storage<String> storageString = new Storage<>();
    storageString.add("Petya");
    storageString.add("Vasya");
    storageString.add("Dilan");
    System.out.println(storageString.statistics());
    System.out.println(storageString.remove("Petya"));
    System.out.println(storageString.remove("Va"));
    System.out.println(storageString.statistics());
    System.out.println(storageString.getHistory());

}