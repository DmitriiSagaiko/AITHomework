package Lesson26.Task1;

import java.awt.HeadlessException;

public class MainSport {

  public static void main(String[] args) {
    Human human = new Human(10,15,"Человек");
    Amateur amateur = new Amateur(15,10, "Любитель");
    Professional professional = new Professional(25,5, "Профессионал");
    human.run();
    amateur.run();
    professional.run();
  }

}
