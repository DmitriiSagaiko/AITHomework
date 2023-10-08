package Lesson23;

import java.util.Arrays;

public class HomeworkLesson23 {

  public static void main(String[] args) {
    int[] array = {4,3,2,1,6,5};
    bubbleSort(array);
    System.out.println(Arrays.toString(array));
  }

  public static int[] bubbleSort(int[] inputArray) {
    int k = 0;
    while (k < inputArray.length) {
      for (int i = 0; i < inputArray.length - 1; i++) {
        if (inputArray[i] > inputArray[i + 1]) {
          int temp = inputArray[i];
          inputArray[i] = inputArray[i + 1];
          inputArray[i + 1] = temp;
        }
      }
      k++;
    }
  return inputArray;
  }
}
