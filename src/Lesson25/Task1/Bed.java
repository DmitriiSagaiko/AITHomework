package Lesson25.Task1;

public class Bed {

  private boolean isSoft;

  private boolean isDigitalized;

  private final String name;


  public Bed(boolean isSoft, boolean isDigitalized, String name) {
    this.isSoft = isSoft;
    this.isDigitalized = isDigitalized;
    this.name = name;
  }

  public String toString() {
    return "{Эта кровать " + name + ((isSoft) ? " она мягкая" : "она твердая ") + ((isDigitalized)
        ? " Она умная " : "она обычная}");
  }

  public boolean isSoft() {
    return isSoft;
  }

  public void setSoft(boolean soft) {
    isSoft = soft;
  }

  public boolean isDigitalized() {
    return isDigitalized;
  }

  public void setDigitalized(boolean digitalized) {
    isDigitalized = digitalized;
  }

  public String getName() {
    return name;
  }

}
