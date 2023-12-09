package Lesson62;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

  public static void main(String[] args) {
    String text = "Bears, Bees, and Bunnies are beautiful.";
    Matcher matcher = Pattern.compile("[B|b]").matcher(text);
    while (matcher.find()) {
      System.out.print(matcher.group() + " ");
    }
  }

}
