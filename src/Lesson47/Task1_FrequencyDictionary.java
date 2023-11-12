package Lesson47;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task1_FrequencyDictionary {

  public static void main(String[] args) {
    String text = "Строка для проверки количества вхождений слов" +
        ".\n Строка для проверки и теста. и количества слов для проверки";

    Map<String, Integer> frequencyMap = frequencyDictionary(text);
    frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

    Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

    System.out.println("\nВхождение символов: ");
    frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
    System.out.println();
  }

  private static Map<Character, Integer> frequencyCharsDictionary(String text) {

    Map<Character, Integer> output = new TreeMap<>();
    for (Character c : text.toCharArray()) {
      output.put(c, output.getOrDefault(c, 0) + 1);
    }
    return output;
  }


  private static Map<String, Integer> frequencyDictionary(String text) {
    String[] words = text.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "").split("\\s+");

    Map<String, Integer> output = new LinkedHashMap<>();
    //заполняем мапу ключами
    for (String string : words) {
      output.put(string, output.getOrDefault(string, 0) + 1);
    }
    return output;

  }
}
