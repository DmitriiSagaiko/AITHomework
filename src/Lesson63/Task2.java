package Lesson63;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

  public static void main(String[] args) {
    String text = "I need to rewrite and reread these reports.";
    Pattern pattern = Pattern.compile("re\\w{1,}");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }

}
