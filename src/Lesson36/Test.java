package Lesson36;
import Lesson36.MyComparator;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComparatorTest {

  Integer[] array;


  @BeforeEach
  void setUp() {
    array = new Integer[]{1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
  }



  @Test
  void arrayEquals() {
    Arrays.sort(array,new MyComparator());
    Assertions.assertArrayEquals(array, new Integer[] {2, 4, 6, 8, 9, 7, 7, 5, 3, 1});
  }

}
