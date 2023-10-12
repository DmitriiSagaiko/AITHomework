package Lesson26.Task1;

public class Amateur extends Human {
  private int speed = 15;

  private int timeToRest = 10;

  @Override
  public void run() {
    System.out.println("Я бегу со скорость " + speed + " и мне нужно для отдыха");
    showRestTime();
  }

  @Override
  public void showRestTime() {
    System.out.println(timeToRest + " мин");
  }
}
