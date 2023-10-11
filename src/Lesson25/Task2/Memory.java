package Lesson25.Task2;

public class Memory extends Component {

  private int amountOfMemory;
  private double frequency;

  public Memory(String brand, String model, int amountOfMemory, double frequency) {
    super(brand, model);
    this.amountOfMemory = amountOfMemory;
    this.frequency = frequency;
  }

  public String toString() {
    return " {" + model + " от бренда " + brand + " С частотой " + frequency + " ГГц"
        + " с памятью " + amountOfMemory + "Гб}; ";
  }

  public int getAmountOfMemory() {
    return amountOfMemory;
  }

  public double getFrequency() {
    return frequency;
  }
}
