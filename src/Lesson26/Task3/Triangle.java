package Lesson26.Task3;

public class Triangle extends Figure {

  private double side1 = 3;
  private double side2 = 4;
  private double side3 = 5;

  @Override
  public void calculateSquare() {
    // Формула Герона
    double p = (side1 + side2 + side3) / 2;
    System.out.println(
        Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)) + " Это площадь треугольника со сторонами " + side1 + " " + side2 + " " + side3);
  }

}

