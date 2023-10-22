package Lesson33;

import java.util.Random;

public class Show {
private String showName;
private Random random = new Random();

  public Show(String showName) {
    this.showName = showName;
  }

  public String getShowName() {
    return showName;
  }

  public void setShowName(String showName) {
    this.showName = showName;
  }
}
