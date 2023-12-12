package Lesson63;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
  public static void main(String[] args) {
    String text = "Мои контакты: email@example.com, test.email@domain.ru,"
        + " abcd_@mail.ru,abcd^@mail.ru, a@gmail.com, aaaaatgoogle.com, test.email@domainru";
    //Есть собака
    //есть точка после собаки
    //минимум 2 символа перед собакой
    //до собаки . _ -
    // после собаки минимум 2 символа точка и как минимум еще 2  символа
    Pattern pattern = Pattern.compile("\\b[a-zA-Z0-9._-]{2,}@\\w{2,}\\.\\w{2,}\\b");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }

}
