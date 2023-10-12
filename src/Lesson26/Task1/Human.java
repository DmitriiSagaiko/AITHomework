package Lesson26.Task1;

public class Human {

  private int speed = 10;

  private int timeToRest = 15;

  public void run() {
    System.out.println("Я бегу со скорость " + speed + " и мне нужно для отдыха");
    showRestTime();
  }

  public void showRestTime() {
    System.out.println(timeToRest + " мин");
  }
////////////////////////////////////////////
  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getTimeToRest() {
    return timeToRest;
  }

  public void setTimeToRest(int timeToRest) {
    this.timeToRest = timeToRest;
  }
}
