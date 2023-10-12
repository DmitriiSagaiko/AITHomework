package Lesson26.Task3;

public class Square extends Figure {

  private int side = 4;

  @Override
  public void calculateSquare() {
    System.out.println(side * side + " Это площадь квадрата со стороной " + side);
  }

}
