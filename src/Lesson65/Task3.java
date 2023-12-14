package Lesson65;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

  public static void main(String[] args) {
    String text = "contact@example.com, user@test.com, admin@example.com";
    Pattern pattern = Pattern.compile("\\w+(?=@example.com)");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      System.out.println(matcher.group() + " index: " + matcher.start());
    }
  }
}
