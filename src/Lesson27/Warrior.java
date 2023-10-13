package Lesson27;

public class Warrior extends GameCharacter{

  public Warrior() {
    this.name = "Warrior";
  }

  @Override
  public void attack() {
    System.out.println(name + " атакует в ближнем бою");
  }
}
