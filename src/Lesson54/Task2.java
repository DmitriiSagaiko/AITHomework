package Lesson54;

import java.util.stream.Stream;

public class Task2 {

  public static void main(String[] args) {
    String text = "Hello, world and good, afternoon";
    int countLetters = countLetters(text);
    int countLetters1 = countLetters(text);
    System.out.println("countLetters: " + countLetters);
    System.out.println("countLetters1: " + countLetters1);
  }

  private static int countLetters(String text) {
    return Stream.of(text.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "").split("\\s+"))
        .filter(s -> s.length() > 4)
        .mapToInt(String::length)
        .reduce(0, Integer::sum);
  }

  private static int countLetters1(String text) {
    long a = Stream.of(text.split("\\s+"))
        .filter(s -> s.length() > 4)
        .flatMapToInt(String::chars)
        .mapToObj(i->(char) i)
        .filter(Character::isAlphabetic)
        .count();
    return (int) a;


  }

}
