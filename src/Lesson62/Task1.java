package Lesson62;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

  public static void main(String[] args) {
    String text = "Моя дата рождения 2.6.1990";
    Pattern pattern = Pattern.compile("[0-6]");
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      System.out.print(matcher.group() + " ");
    }
  }

}
