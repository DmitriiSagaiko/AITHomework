package Lesson46;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {

  public static void main(String[] args) {
    Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
    Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));
    System.out.println(union(set1, set2));
    System.out.println(intersection(set1, set2));
    System.out.println(difference(set1, set2));

  }

  public static Set<String> union(Set<String> set1, Set<String> set2) {
    Set<String> output = new HashSet<>(set1);
    output.addAll(set2);
    return output;
  }

  public static Set<String> intersection(Set<String> set1, Set<String> set2) {
    Set<String> output = new HashSet<>(set1);
    output.retainAll(set2);
    return output;
  }

  public static Set<String> difference(Set<String> set1, Set<String> set2) {
    Set<String> output = new HashSet<>(set1);
    output.removeAll(set2);
    return output;
  }

}
