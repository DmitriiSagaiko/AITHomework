package Lesson21;

import Lesson20.Cat;

public class MainCar {

  public static void main(String[] args) {
    System.out.println(Car.countCar);
    Car car1 = new Car("aa", 5);
    Car car2 = new Car("bb", 5);
    System.out.println(Car.getCountCar());
  }

}
