package Lesson52;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task1 {

  public static void main(String[] args) {
    List<Integer> myList = List.of(150, 200, 15, 2, 1, 0, -100, -400, 95, 84, 23, 78, 12);

    Predicate<Integer> even = integer -> integer % 2 == 0;
    Predicate<Integer> moreTen = integer -> integer > 10;
    Predicate<Integer> lessHundred = integer -> integer < 100;
    Predicate<Integer> combined = (even.and(moreTen)).and(lessHundred);

    System.out.println(filteredList(myList,combined));

  }

  public static List<Integer> filteredList(List<Integer>input, Predicate<Integer> predicate) {
    List<Integer> result = new ArrayList<>();
    for(int value : input) {
      if (predicate.test(value)) {
        result.add(value);
      }
    }
    return result;
  }

}
