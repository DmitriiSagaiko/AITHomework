package Lesson26.Task2;

public class Motorcycle extends Vehicle {

  public Motorcycle(String name, boolean hasEngine) {
    super(name, hasEngine);
  }

  @Override
  public void startEngine() {
    System.out.println((this.hasEngine) ? "Двигатель у мотоцикла " + this.name + " запущен"
        : "У " + this.name + " нет двигателя");

  }

}
