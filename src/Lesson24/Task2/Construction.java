package Lesson24.Task2;

public class Construction {
  private String name;

  private String material;

  private int lifeTime;

  public Construction(String name, String material, int lifeTime) {
    this.name = name;
    this.material = material;
    this.lifeTime = lifeTime;
  }

  public String info() {

    return "Это сооружение " + name + " оно сделано из" + material + " ожидаемый срок "
        + "эксплуатации " + lifeTime + " лет";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public int getLifeTime() {
    return lifeTime;
  }

}
