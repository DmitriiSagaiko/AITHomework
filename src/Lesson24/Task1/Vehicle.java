package Lesson24.Task1;

public class Vehicle {

  public String model;

  public int yearOfManufacture;

  public Vehicle() {
    this.model = "Default";
  }

  public Vehicle(String model, int yearOfManufacture) {
    System.out.println("Вызов конструтора Vehicle");
    this.model = model;
    this.yearOfManufacture = yearOfManufacture;
  }

  public void start() {
    System.out.println(model + " Начало движение");
  }

  public void stop() {
    System.out.println(model + " Тормозит");
  }

  public String toString() {
    return (model + " Год выпуска " + yearOfManufacture);
  }


  ////// setter, getter
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYearOfManufacture() {
    return yearOfManufacture;
  }

  public void setYearOfManufacture(int yearOfManufacture) {
    this.yearOfManufacture = yearOfManufacture;
  }
}
