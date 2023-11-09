package Lesson46;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {


  public static void main(String[] args) {
    String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
    System.out.println(getUniqueSortedWords(testString));
  }


  public static Set<String> getUniqueSortedWords(String input) {

    Comparator<String> myComp = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
          return 1;
        } else if (o1.length() == o2.length()) {
          if (o1.charAt(0) > o2.charAt(0)) {
            return 1;
          } else {
            return 0;
          }
        } else {
          return -1;
        }
      }
    };

    Set<String> output = new TreeSet<>(myComp);

    String result = input.replaceAll("(?U)[^\\p{L}\\p{N}\\s]+", "");
    String[] words = result.split("\\s");
    System.out.println(Arrays.toString(words));
    output.addAll(Arrays.asList(words));
    return output;
  }

}
