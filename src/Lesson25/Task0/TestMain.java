package Lesson25.Task0;

import java.util.Arrays;

public class TestMain {

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    int index = 1;
    System.out.println(Arrays.toString(removeByindex(array, index)));

    Bus bus = new Bus("AA", 40);
    Passenger passenger = new Passenger("Arkadii");
    Passenger passenger1 = new Passenger("Gennadii");
    Passenger passenger2 = new Passenger("Fedor");
    Passenger passenger3 = new Passenger("Grisha");
    bus.takePassenger(passenger);
    bus.takePassenger(passenger1);
    bus.takePassenger(passenger2);
    System.out.println(bus.toString());
    bus.dropPassenger(passenger1);
    System.out.println(bus.toString());
    bus.takePassenger(passenger1);
    System.out.println(bus.toString());
    bus.takePassenger(passenger3);
    System.out.println(bus.toString());

  }

  //Тестовый метод для модификации класса Bus
  public static int[] removeByindex(int[] array, int index) {
    int[] outputArray = new int[array.length];
    for (int i = 0; i < index; i++) {
      outputArray[i] = array[i];
    }
    for (int i = index; i < array.length - 1; i++) {
      outputArray[i] = array[i + 1];
    }
    outputArray[outputArray.length - 1] = 0;
    return outputArray;
  }

}
