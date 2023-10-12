package Lesson26.Task3;

public class Circle extends Figure {


  private double radius = 5;


  @Override
  public void calculateSquare() {
    System.out.println(Math.PI * radius * radius + " Это площадь круга c радиусом " + radius);
  }


}
