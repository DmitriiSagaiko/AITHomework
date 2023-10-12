package Lesson26.Task2;

public class Bicycle extends Vehicle {


  public Bicycle(String name, boolean hasEngine) {
    super(name, hasEngine);
  }

  @Override
  public void startEngine() {
    System.out.println((this.hasEngine) ? "Двигатель" + this.name + " запущен"
        : "У " + this.name + " нет двигателя");
  }

}
