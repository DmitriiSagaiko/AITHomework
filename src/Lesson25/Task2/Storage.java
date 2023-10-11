package Lesson25.Task2;

public class Storage extends Component {

  private int amountOfMemory;

  public Storage(String brand, String model, int amountOfMemory) {
    super(brand, model);
    this.amountOfMemory = amountOfMemory;
  }

  public String toString() {
    return "{" + model + " от бренда " + brand
        + " объемом памяти " + amountOfMemory + " Тб }";
  }

  public int getAmountOfMemory() {
    return amountOfMemory;
  }
}
