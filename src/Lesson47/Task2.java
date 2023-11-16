package Lesson47;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {

  public static void main(String[] args) {
    Map<String, Integer> map1 = new HashMap<>();
    map1.put("apple", 50);
    map1.put("banana", 20);
    map1.put("cherry", 30);

    Map<String, Integer> map2 = new HashMap<>();
    map2.put("banana", 25);
    map2.put("cherry", 30);
    map2.put("date", 40);

//    Map<String, Integer> intersectionMap = intersection(map1, map2);
//    intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
//
//    System.out.println(map1);

    Map<String, Integer> intersectionMap1 = intersection2(map1, map2);
    intersectionMap1.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println(map1);
  }

  private static Map<String, Integer> intersection(Map<String, Integer> map1,
      Map<String, Integer> map2) {
    Map<String, Integer> output = new HashMap<>();
    // keySet связан с map1. Это "живые" данные, поэтому такие манипуляции возможны.
    // Но изменение keyset влечет за собой изменение map1
    Set<String> keySet1 = map1.keySet();
    Set<String> keySet2 = map2.keySet();
    keySet1.retainAll(keySet2);

    for (String key : keySet1) {
      output.put(key, map2.get(key));
    }
    return output;
  }


  private static Map<String, Integer> intersection2(Map<String, Integer> map1,
      Map<String, Integer> map2) {
    Map<String, Integer> output = new HashMap<>(map1);

    Set<String> keySet1 = output.keySet();
    keySet1.retainAll(map2.keySet());
    return output;
  }

}
