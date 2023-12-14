package Lesson65;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

  public static void main(String[] args) {
    String text = "red apple, green apple, just an apple";
    Pattern pattern = Pattern.compile("(?<!green )\\bapple\\b");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      System.out.println(matcher.group() + " index: " + matcher.start());
    }
  }

}
