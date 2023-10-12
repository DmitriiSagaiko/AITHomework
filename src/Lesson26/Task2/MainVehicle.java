package Lesson26.Task2;

public class MainVehicle {

  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[3];

    vehicles[0] = new Car("Машина BMW", false);
    vehicles[1] = new Bicycle("Горный велосипед", false);
    vehicles[2] = new Motorcycle("Yamaha", false);

    for (Vehicle vehicle : vehicles) {
      vehicle.startEngine();
    }
  }

}
