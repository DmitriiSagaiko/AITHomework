package Lesson37.Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task2 {

  public static void main(String[] args) {
    RubberArray ra = new RubberArray<>();
    LocalDate d1 = LocalDate.of(2013, 10, 27);
    LocalDate d2 = LocalDate.of(2023, 5, 27);
    LocalDate d3 = LocalDate.of(2023, 6, 27);
    LocalDate d4 = LocalDate.of(2023, 7, 27);
    LocalDate d5 = LocalDate.of(2023, 10, 27);

    ra.add(d1, d2, d3, d4, d5);
    System.out.println(rangeDaysBetween(ra));
  }

  public static long rangeDaysBetween(RubberArray inputRubberArray) {
    long maxDays = 0;
    LocalDate dateAfterParse;
    LocalDate dateAfterParse1;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    for (int i = 0; i < inputRubberArray.length(); i++) {
      String a = inputRubberArray.toArray()[i].toString();
      dateAfterParse = LocalDate.parse(a, dateTimeFormatter);
      for (int j = i + 1; j < inputRubberArray.length(); j++) {
        String b = inputRubberArray.toArray()[j].toString();
        dateAfterParse1 = LocalDate.parse(b, dateTimeFormatter);
        if (Math.abs(dateAfterParse.until(dateAfterParse1, ChronoUnit.DAYS)) > maxDays) {
          maxDays = Math.abs(dateAfterParse.until(dateAfterParse1, ChronoUnit.DAYS));
        }
      }
    }
    return maxDays;
  }
}

