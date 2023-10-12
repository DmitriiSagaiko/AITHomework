package Lesson26.Task2;

public class MainVehicle {

  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[3];

    vehicles[0] = new Car();
    vehicles[1] = new Bicycle();
    vehicles[2] = new Motorcycle();

    for(Vehicle vehicle : vehicles) {
      vehicle.startEngine();
    }
  }

}
