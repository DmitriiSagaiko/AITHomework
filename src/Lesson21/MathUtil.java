package Lesson21;

public class MathUtil {

  // static method позволяет использовать его без созданиях экземпляра класса
  public static int sumOfInts(int x, int... ints) {
    int sum = x;
    for (int value : ints) {
      sum += value;
    }
    return sum;
  }

}
