package Lesson24.Task2;

public class Hospital extends Construction{

  private int capacity;

  private int operationsRoom;

  static int numberOfThickPerson;


  public Hospital(String name, String material, int lifeTime, int capacity, int operationsRoom) {
    super(name, material, lifeTime);
    this.capacity = capacity;
    this.operationsRoom = operationsRoom;
  }

  public void income(int amountOfVictim) {
    numberOfThickPerson +=amountOfVictim;
  }

  public String info() {
    return "Это больница " + getName() + " оно сделано из" + getMaterial() + " ожидаемый срок "
        + "эксплуатации " + getLifeTime() + " лет." +
        " Она содержит " + operationsRoom + " операционных. " +
        "Сейчас кол-во больных: " + numberOfThickPerson;
  }


}
