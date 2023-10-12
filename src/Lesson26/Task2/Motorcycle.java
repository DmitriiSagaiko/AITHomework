package Lesson26.Task2;

public class Motorcycle extends Vehicle{
  private boolean hasEngine = true;

  @Override
  public void startEngine() {
    System.out.println((hasEngine) ? "Двигатель мотоцикла запущен" : "У мотоцикла нет двигателя");
  }

}
