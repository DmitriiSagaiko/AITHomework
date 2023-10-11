package Lesson25.Task2;

public class Processor extends Component {

  private double frequency;
  private int cashMemory;

  public Processor(String brand, String model, double frequency, int cashMemory) {
    super(brand, model);
    this.frequency = frequency;
    this.cashMemory = cashMemory;
  }

  public String toString() {
    return "{ " + model + " от бренда " + brand + " С частотой " + frequency + " ГГц "
        + " с кеш памятью " + cashMemory + "мб}; ";
  }

  public double getFrequency() {
    return frequency;
  }

  public int getCashMemory() {
    return cashMemory;
  }
}
