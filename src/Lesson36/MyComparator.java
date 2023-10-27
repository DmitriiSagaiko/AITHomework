package Lesson36;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

  @Override
  public int compare(Integer int1, Integer int2) {

    if (int1 % 2 == 0 && int2 % 2 == 0) {
      return int1 - int2;
    } else if ((int1 % 2 != 0 && int2 % 2 == 0)) {
      return 1;
    } else if ((int1 % 2 == 0 && int2 % 2 != 0)) {
      return -1;
    }
    else  {
      return int2-int1;
  }

}

  public static void main(String[] args) {
    Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
    MyComparator myComparator = new MyComparator();

    Arrays.sort(integers, myComparator);
    System.out.println(Arrays.toString(integers));
  }
}
