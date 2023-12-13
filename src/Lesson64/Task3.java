package Lesson64;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

  public static void main(String[] args) {
    String text = "<p>Это пример текста.</p> <p>Это другой текст.</p>";
    Pattern pattern = Pattern.compile("<([а-яa-z]*)[^>]*>([^<]*)(</\\1>)");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      System.out.println(matcher.group(2));
    }
  }

}
