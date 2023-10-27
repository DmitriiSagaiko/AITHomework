package Lesson37.Task2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task2 {

  public static void main(String[] args) {
    RubberArray<LocalDate> ra = new RubberArray<>();
    LocalDate d1 = LocalDate.of(2013, 10, 27);
    LocalDate d2 = LocalDate.of(2023, 5, 27);
    LocalDate d3 = LocalDate.of(2023, 6, 27);
    LocalDate d4 = LocalDate.of(2023, 7, 27);
    LocalDate d5 = LocalDate.of(2023, 10, 27);

    ra.add(d1, d2, d3, d4, d5);
    System.out.println(rangeDaysBetween(ra));
  }

  public static long rangeDaysBetween(RubberArray<LocalDate> inputRubberArray) {
    long maxDays = 0;
    LocalDate max = inputRubberArray.getFirst();
    LocalDate min = max;
    for(LocalDate localDate : inputRubberArray) {
      if (localDate.isAfter(max)) {
        max = localDate;
      }
      if (localDate.isBefore(min)) {
        min=localDate;
      }
    }
    maxDays = Math.abs(max.until(min,ChronoUnit.DAYS));
    return maxDays;
  }
}

