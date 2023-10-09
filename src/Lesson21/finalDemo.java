package Lesson21;

public class finalDemo {

  private final int x = 10;
  private final int[] ints = new int[10];

  private int y;
  private double[] doubles;

  public finalDemo() {
    //x = 15; не работает, тк final не дает поменять значение
    //ints = null;
    ints[0] = 10; // позволяет изменять значение массива

  }

  public int getX() {
    return x;
  }

  public int[] getInts() {
    return ints;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public double[] getDoubles() {
    return doubles;
  }

  public void setDoubles(double[] doubles) {
    this.doubles = doubles;
  }
}
