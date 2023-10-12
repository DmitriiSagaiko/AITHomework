package Lesson26.Task2;

public class Car extends Vehicle {

  private boolean hasEngine = true;


  @Override
  public void startEngine() {
    System.out.println((hasEngine) ? "Двигатель машины запущен" : "У машины нет двигателя");
  }
}
