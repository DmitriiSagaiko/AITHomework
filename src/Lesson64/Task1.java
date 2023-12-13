package Lesson64;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

  public static void main(String[] args) {
    String text = "Контакт: email@example.com";
    Pattern pattern = Pattern.compile("\\b(\\w+)@(\\w+\\.\\w+)\\b");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      System.out.println("Имя пользователя: " + matcher.group(1));
      System.out.println("Домен: " + matcher.group(2));
    }
  }

}
