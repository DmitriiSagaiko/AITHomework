package Lesson65;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

  public static void main(String[] args) {
    String text = "start middle top end, beginning center finish";
    Pattern pattern = Pattern.compile("(?<=start )\\b.*?\\b(?= end)");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      System.out.println(matcher.group() + " index: " + matcher.start());
    }
  }

}
