package Lesson27;

public class Archer extends  GameCharacter{

  public Archer() {
    this.name = "Archer";
  }

  @Override
  public void attack() {
    System.out.println(name + " атакует из лука");
  }
}
