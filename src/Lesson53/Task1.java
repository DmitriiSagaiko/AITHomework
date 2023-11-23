package Lesson53;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

  public static void main(String[] args) {
    List<String> list = List.of("aaa", "bbb","ccc", "sausage", "ketchup", "mayo", "aaa", "mayo",
        "Alcohol");

    List<String> output = list.stream()
        .filter(string -> (string.startsWith("A")) || (string.startsWith("a")))
        .distinct()
        .sorted()
        .collect(Collectors.toList());

    System.out.println(output);
  }


}
