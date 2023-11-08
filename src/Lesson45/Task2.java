package Lesson45;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {

  public static void main(String[] args) {

    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new ArrayList<>();

    for (int i = 0; i < 1000; i++) {
      Random random = new Random();
      Random random1 = new Random();
      arrayList.add(random.nextInt(10000));
      linkedList.add(random1.nextInt(10000));
    }

    long startTimeLinked = System.currentTimeMillis();
    System.out.println(getAllElementsByIndex(linkedList) + "ms get Linked");
    System.out.println(addNewElementsByIndex(linkedList) + "ms add Linked");
    System.out.println(deleteElementByIndex(linkedList) + "ms delete Linked");
    System.out.println(
        "full time for 3 method to LinkedList = " + (System.currentTimeMillis() - startTimeLinked)
            + "ms");

    startTimeLinked = System.currentTimeMillis();
    System.out.println(getAllElementsByIndex(arrayList) + "ms get Array");
    System.out.println(addNewElementsByIndex(arrayList) + "ms add Array");
    System.out.println(deleteElementByIndex(arrayList) + "ms delete Array");
    System.out.println(
        "full time for 3 method to Arraylist = " + (System.currentTimeMillis() - startTimeLinked)
            + "ms");


  }


  public static long getAllElementsByIndex(List<Integer> list) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < list.size(); i++) {
      list.get(i);
    }
    long stopTime = System.currentTimeMillis();
    return stopTime - startTime;
  }

  public static long addNewElementsByIndex(List<Integer> list) {
    Random random = new Random();
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 1000; i++) {
      list.add(random.nextInt(list.size()), random.nextInt(10000));
    }
    long stopTime = System.currentTimeMillis();
    return stopTime - startTime;
  }

  public static long deleteElementByIndex(List<Integer> list) {
    Random random = new Random();
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 1000; i++) {
      list.remove(random.nextInt(list.size()));
    }
    long stopTime = System.currentTimeMillis();
    return stopTime - startTime;
  }

}
