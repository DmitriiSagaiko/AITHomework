package Lesson63;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

  public static void main(String[] args) {
    String text = "Мой индекс 12345, а его индекс 67890. А число 456789 не подходит. Слипшийся индекс12555";
    Pattern pattern = Pattern.compile("\\b\\d\\d\\d\\d\\d\\b");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }

}
