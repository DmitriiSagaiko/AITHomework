package Lesson46;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

  public static void main(String[] args) {
    String string = "abcdefj ab,cdf,";
    System.out.println(getFirstUniqueChar(string));
  }

  public static char getFirstUniqueChar(String input) {
    char[] chars = input.toCharArray();
    Set<Character> mySet1 = new LinkedHashSet<>();
    Set<Character> mySet = new LinkedHashSet<>() {
    };
    for (int i = 0; i < chars.length; i++) {
      if (!mySet.add(chars[i])) {
        mySet1.add(chars[i]);
      }
    }
    mySet.removeAll(mySet1);

    List<Character> characters = new ArrayList<>(mySet);
    // можно взять mySet.iterator().next()
    System.out.println(mySet.iterator().next());
    return characters.get(0);

  }
}
