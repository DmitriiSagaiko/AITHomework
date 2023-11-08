package Lesson45;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {

  public static void main(String[] args) {

    Random random = new Random();

    List<Integer> arrayList = new ArrayList<>();
    arrayList.add(random.nextInt(10));
    arrayList.add(random.nextInt(10));
    arrayList.add(random.nextInt(10));
    arrayList.add(random.nextInt(10));
    arrayList.add(random.nextInt(10));

    List<Integer> linkedList = new ArrayList<>();
    linkedList.add(random.nextInt(10));
    linkedList.add(random.nextInt(10));
    linkedList.add(random.nextInt(10));
    linkedList.add(random.nextInt(10));
    linkedList.add(random.nextInt(10));
    linkedList.add(random.nextInt(10));
    linkedList.add(random.nextInt(10));
    linkedList.add(random.nextInt(10));
    linkedList.add(random.nextInt(10));

    System.out.println(arrayList + " arrayList");
    System.out.println(linkedList + " linkedList");
    System.out.println(getTheSameElements(arrayList, linkedList));
  }

  public static List<Integer> getTheSameElements(List<Integer> arrayList,List<Integer> linkedList) {
    List<Integer> output = new ArrayList<>(List.copyOf(arrayList));
    output.retainAll(linkedList);
    return output;
  }

}


