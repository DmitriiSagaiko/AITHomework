package Lesson54;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

  public static void main(String[] args) {

    List<Integer> integers = List.of(1, 15, 25, 37, 48, 59, 70, 81, 92, 93, 45, 46, 2, 95);


    List<Integer> output = integers.stream()
        .filter(integer -> integer > 10)
        .sorted(Comparator.comparingInt(a -> a % 10))
        .collect(Collectors.toList());
    System.out.println(output);

  }


}
