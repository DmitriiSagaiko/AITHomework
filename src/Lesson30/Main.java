package Lesson30;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    RubberArray<String> rubberArray = new RubberArray<>();
    rubberArray.add("Hello", "How are You", "Good", "A", "B", "C", "D" , " E" , " F", "G", "K", "A");
    System.out.println(rubberArray);
    rubberArray.removeByIndex(1);
    System.out.println(rubberArray);
    System.out.println(rubberArray.length() + " cursor");
    System.out.println(rubberArray.indexOf("K"));
    System.out.println(rubberArray.lastIndexOf("A"));
    System.out.println(rubberArray.contains("Java"));
    System.out.println(rubberArray.contains("A"));

    System.out.println(Arrays.toString(rubberArray.toArray()));

    RubberArray<String[]> rubberArray1 = new RubberArray<>();
    String[] seasons  = new String[] {"Winter", "Spring", "Summer", "Autumn"};
    rubberArray1.add(seasons);
    System.out.println(Arrays.deepToString(rubberArray1.toArray()));
  }



}
