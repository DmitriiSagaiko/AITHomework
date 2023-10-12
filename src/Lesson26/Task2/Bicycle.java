package Lesson26.Task2;

public class Bicycle extends Vehicle{
  private boolean hasEngine = false;

  @Override
  public void startEngine() {
    System.out.println((hasEngine) ? "Двигатель велосипеда запущен" : "У велосипеда нет двигателя");
  }

}
