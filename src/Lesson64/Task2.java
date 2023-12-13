package Lesson64;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

  public static void main(String[] args) {
    String text = "Она сказала: 'быстро', а потом добавила: 'осторожно'.";
    Pattern pattern = Pattern.compile("'[а-я]+?'");
    Matcher matcher = pattern.matcher(text);

    matcher.find();
    System.out.println(matcher.group());
  }

}
