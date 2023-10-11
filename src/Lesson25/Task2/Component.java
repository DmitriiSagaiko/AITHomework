package Lesson25.Task2;

public class Component {

  protected String brand;

  protected String model;


  public Component( String brand, String model) {
    this.model = model;
    this.brand = brand;
  }

  public String toString() {
    return "Это: " + model + " от бренда " + brand;
  }
}
