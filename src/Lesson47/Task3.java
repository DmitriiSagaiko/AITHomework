package Lesson47;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task3 {

  public static void main(String[] args) {
    Map<String, String> directFlights = new HashMap<>();
    directFlights.put("New York", "Chicago");
    directFlights.put("Chicago", "Denver");
    directFlights.put("Denver", "Las Vegas");
    directFlights.put("Boston", "Miami");
    directFlights.put("Miami", "New York");
    directFlights.put("Los Angeles", "San Francisco");
    directFlights.put("San Francisco", "New York");
    directFlights.put("Nowosibirsk", "Omsk");

    List<String> route = findRoute(directFlights, "Boston", "Las Vegas");
    System.out.println(route);
  }

  private static List<String> findRoute(Map<String, String> map, String departure, String arrival) {
    List<String> output = new LinkedList<>();


    if (!map.containsKey(departure)) {
      System.out.println("отсюда нельзя вылететь");
      return output;
    }
    if (!map.containsValue(arrival)) {
      System.out.println("Сюда нельзя прилететь");
      return output;
    }

    String currentCity = departure;

    while (true) {
//      if (map.get(currentCity) == null) {
//        System.out.println("В такой город нельзя прилететь");
//        output.clear();
//        return output;
//      }
      output.add(currentCity);

      currentCity = map.get(currentCity);

      if (arrival.equals(currentCity)) {
        output.add(currentCity);
        return output;
      }

    }

  }

}
