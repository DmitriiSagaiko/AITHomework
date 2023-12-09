package Lesson62;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

  public static void main(String[] args) {
    String text = "myemail@example.co!m another&email@example.com";
    Matcher matcher = Pattern.compile("!|@|&").matcher(text);
    while (matcher.find()) {
      System.out.print(matcher.group() + " ");
    }
  }

}
