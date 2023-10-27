package Lesson37.Task1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Task1 {

  /*
  ДЗ
Task 1
Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
Task 2
Написать метод, принимающий массив или MyArrayList (наш самописный резиновый массив)
из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней и
поздней датами в этом списке
   */

  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today);
    System.out.println("Год : " + today.getYear());
    System.out.print("| месяц : " + today.getMonth());
    System.out.print("| день : " + today.getDayOfWeek());

    LocalDate bitrhDay = LocalDate.of(1995,5,5);
    System.out.println();
    System.out.println(bitrhDay);
    System.out.println(bitrhDay.isEqual(today) + " Cегодня 5 мая?");

    LocalTime currentTime = LocalTime.now();
    System.out.println(currentTime + " текущее");
    System.out.println(currentTime.plusHours(3) + " текущее +3ч");

    LocalDate inAWeek = today.plusWeeks(1);
    LocalDate yearAgo = today.minusYears(1);
    LocalDate inYear = today.plus(1, ChronoUnit.YEARS);
    System.out.println(inAWeek + " Через неделю");
    System.out.println(yearAgo + " год назад");
    System.out.println(inYear + " через год");
    LocalDate tomorrow = today.plusDays(1);
    LocalDate yesterday = today.minus(1,ChronoUnit.DAYS);
    System.out.println(tomorrow.isAfter(today));
    System.out.println(yesterday.isBefore(today));
  }

}
