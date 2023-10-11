package Lesson25.Task1;

public class Manufactury  extends Construction {

  private int employers;
  private int machine;

  static int occupiedMachines;

  public Manufactury(String name, String material, int lifeTime, int employers, int machine) {
    super(name, material, lifeTime);
    this.employers = employers;
    this.machine = machine;
  }

  public void work(int tasks){
    if (tasks>machine) {
      System.out.println("Нельзя столько воспроизвести!");
    } else {
      occupiedMachines += tasks;
      System.out.println("Приняли в работу");
    }
  }

  public String info() {
    return "Это Завод " + getName() + " оно сделано из " + getMaterial() + " ожидаемый срок "
        + "эксплуатации " + getLifeTime() + " лет." +
        " Здесь работает " + employers + " человек на  " + machine +
        " станках. Станков занято:" + occupiedMachines ;
  }

}
