package Lesson62;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

  public static void main(String[] args) {
    String text = "London is the capital of Great Britain.";
    Matcher matcher = Pattern.compile("[A-Z]").matcher(text);
    while (matcher.find()) {
      System.out.print(matcher.group() + " ");
    }
  }

}
