package Lesson33;


import java.util.Random;

public class Show {

  private Random random = new Random();

  private String showName;
  private Show[] shows = new Show[5];

  private Channel channel;

  public Show(Channel channel) {
    this.channel = channel;

    this.shows = new Show[5];
    shows[0] = new Show("Comedy Club");
    shows[1] = new Show("Новости");
    shows[2] = new Show("Кино");
    shows[3] = new Show("Погода");
    shows[4] = new Show("Сериал");
  }

  public Show(String showName) {
    this.showName = showName;
  }

  public void playTheShow() {
    System.out.println("Сейчас идет программа: " + shows[random.nextInt(5)].getShowName());
    System.out.println();
  }

  public String getShowName() {
    return showName;
  }

  public void setShowName(String showName) {
    this.showName = showName;
  }
}
