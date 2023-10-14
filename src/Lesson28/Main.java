package Lesson28;

import java.util.Arrays;

public class Main{

  public static void main(String[] args) {
    Dictionary dictionary = new Dictionary();
    dictionary.put("Привет", "Hello");
    dictionary.put("Пока", "Bye");
    System.out.println(dictionary.get("Рука"));
    String[] words = {"Привет", "Пока", "Джава"};

    Dictionary.Translator translator = dictionary.new Translator();
    System.out.println(Arrays.toString(translator.translate(words)));



  }

}
