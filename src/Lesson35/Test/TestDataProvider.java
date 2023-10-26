package Lesson35.Test;

import Lesson35.Person;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class TestDataProvider {
    static Stream<Arguments>dataForTest() { // Передача разроненных данных
    return Stream.of(
        Arguments.of(new int[] {1,3,5,6}, "hello", true, new Person("trt", "sdfsdf")),
        Arguments.of(new int[] {0,2,4,6}, "Java", false,null),
        Arguments.of(new int[] {5,5,5,5}, "Python", false, null)
    );
  }

}
