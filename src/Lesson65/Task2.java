package Lesson65;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

  public static void main(String[] args) {
    String text = "3a, 4b, 5cat, d6, e7, f8";
    Pattern pattern = Pattern.compile("(?<=\\d)\\w+");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      System.out.println(matcher.group() + " index: " + matcher.start());
    }
  }

}
