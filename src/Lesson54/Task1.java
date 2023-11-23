package Lesson54;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

  public static void main(String[] args) {

    List<Integer> integers = List.of(1, 15, 25, 37, 48, 59, 70, 81, 92, 93, 45, 46, 2, 95);

    Comparator<Integer> integerComparator = (o1, o2) -> {
      int a = o1 % 10;
      int b = o2 % 10;
      if (a > b) {
        return 1;
      } else if (a == b) {
        return 0;
      } else {
        return -1;
      }
    };

    List<Integer> output = integers.stream()
        .filter(integer -> integer > 10)
        .sorted(integerComparator)
        .collect(Collectors.toList());
    System.out.println(output);

  }


}
