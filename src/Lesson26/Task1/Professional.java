package Lesson26.Task1;

public class Professional extends Amateur {

  private int speed = 25;

  private int timeToRest = 5;
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
