package Lesson64;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

  public static void main(String[] args) {
    String text = "Дата: 15-03-2023";
    Pattern pattern = Pattern.compile("(?<day>\\d{2})-(?<month>\\d{2})-(?<year>\\d{4})");
    Matcher matcher = pattern.matcher(text);
    //"Дата: 03/15/2023"
    String newText = matcher.replaceAll("${month}/${day}/${year}");
    System.out.println(newText);

  }

}
