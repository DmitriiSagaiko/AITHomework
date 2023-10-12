package Lesson26.Task3;

public class MainFigure {

  public static void main(String[] args) {
    Figure[] figures = new Figure[3];
    figures[0] = new Circle();
    figures[1] = new Square();
    figures[2] = new Triangle();

    for (Figure currentFigure : figures) {
      currentFigure.calculateSquare();
    }


  }

}
