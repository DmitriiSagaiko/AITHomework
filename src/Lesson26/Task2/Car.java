package Lesson26.Task2;

public class Car extends Vehicle {


  public Car(String name, boolean hasEngine) {
    super(name, hasEngine);
  }

  @Override
  public void startEngine() {
    System.out.println((this.hasEngine) ? "Двигатель у машины " + this.name + " запущен"
        : "У " + this.name + " нет двигателя");
  }
}
