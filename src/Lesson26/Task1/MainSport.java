package Lesson26.Task1;

import java.awt.HeadlessException;

public class MainSport {

  public static void main(String[] args) {
    Human human = new Human();
    Amateur amateur = new Amateur();
    Professional professional = new Professional();
    human.run();
    amateur.run();
    professional.run();
  }

}
