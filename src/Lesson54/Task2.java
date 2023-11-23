package Lesson54;

import java.util.stream.Stream;

public class Task2 {

  public static void main(String[] args) {
    String text = "Hello, world and good afternoon";
    int countLetters = countLetters(text);
    System.out.println("countLetters: " + countLetters);
  }

  private static int countLetters(String text) {
    return Stream.of(text.split("\\s"))
        .filter(s -> s.length() > 4)
        .mapToInt(String::length)
        .reduce(0, Integer::sum);
  }

}
