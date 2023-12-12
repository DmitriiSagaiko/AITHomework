package Lesson63;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

  public static void main(String[] args) {
    String text = "Мои номера: +123-456-7890, +987-654-3210."
        + "@123-466-7890, -123-456-7890, +123-4567-890, +12-3456-7890";

    Pattern pattern = Pattern.compile("\\+\\w{3}-\\w{3}-\\w{4}");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }

}
