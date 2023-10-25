package Lesson34.ArrayList;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    RubberArray<String> rubberArray = new RubberArray<>();
    rubberArray.add("Hello", "How are You", null, "A", "B", "C", "D" , " E" , " F", "G", "K", "A");
//    System.out.println(rubberArray);
//    rubberArray.removeByIndex(1);
//    System.out.println(rubberArray);
//    System.out.println(rubberArray.length() + " cursor");
//    System.out.println(rubberArray.indexOf("K"));
//    System.out.println(rubberArray.lastIndexOf("A"));
//    System.out.println(rubberArray.contains("Java"));
//    System.out.println(rubberArray.contains("A"));
//
//    System.out.println(Arrays.toString(rubberArray.toArray()));
//
//    RubberArray<String[]> rubberArray1 = new RubberArray<>();
//    String[] seasons  = new String[] {"Winter", "Spring", "Summer", "Autumn"};
//    rubberArray1.add(seasons);
//    System.out.println(Arrays.deepToString(rubberArray1.toArray()));

    System.out.println(rubberArray);

    for (String value : rubberArray) {
      System.out.println(value);
    }
    RubberArray<Integer> integerRubberArray = new RubberArray<>();
    integerRubberArray.add(1,2,3,4,5,6);
    System.out.println(integerRubberArray.length());
    for (Integer value : integerRubberArray) {
      System.out.println(value);
    }

    RubberArray<Character> characterRubberArray = new RubberArray<>();
    characterRubberArray.add(null,null,null,null);

    for (Character value : characterRubberArray) {
      System.out.println(value);
    }

  }



}
