package Lesson52;

import java.util.function.BiConsumer;

public class Task3 {

  public static void main(String[] args) {
    BiConsumer<String,String> biConsumer = (s1,s2) -> System.out.println(s1 + "=" + s2);
    biConsumer.accept("Ключ", "Значение");
  }

}
