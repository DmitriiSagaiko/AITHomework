package Lesson21;

public class Car {

  private String model;
  private int powerPS;
  static int countCar; // Принадлежит всему классу!

  public Car(String model, int powerPS) {
    this.model = model;
    this.powerPS = powerPS;
    countCar++;
  }

  public static int getCountCar() {
    // можно обратиться только к static полям или static методам
    return countCar;
  }

  public void info() {
    System.out.println("Car " + model + " Power " + powerPS + " Всего выпущено машин " + countCar);
  }

  public static void main(String[] args) {
    Car car1 = new Car("bmw", 150);
    car1.info();

    Car car2 = new Car("merc", 250);
    car2.info();
    System.out.println("ВСего создано автомобилей " + Car.countCar); // Единственная верная форма записи
  }
}
