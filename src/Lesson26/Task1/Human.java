package Lesson26.Task1;

public class Human {

  protected int speed;

  protected int timeToRest;
  protected String name;

  public Human() {
    this.speed = 10;
    this.timeToRest = 15;
    this.name = "Человек";
  }

  public void run() {
    System.out.println(name +" Бежит со скоростью " + this.speed + " ему нужно для отдыха");
    showRestTime();
  }

  private void showRestTime() {
    System.out.println(this.timeToRest + " мин");
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
