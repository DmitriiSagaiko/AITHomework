package Lesson27;

public class MainCharacter {

  public static void main(String[] args) {
    GameCharacter[] gameCharacters = new GameCharacter[3];
    gameCharacters[0] = new Warrior();
    gameCharacters[1] = new Mage();
    gameCharacters[2] = new Archer();

    for(GameCharacter selected : gameCharacters) {
      selected.attack();
    }
  }

}
