package Lesson27;

public class Mage extends GameCharacter{

  public Mage() {
    this.name = "Mage";
  }

  @Override
  public void attack() {
    System.out.println(name + " атакует заклинанием");
  }
}
