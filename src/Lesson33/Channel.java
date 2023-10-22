package Lesson33;

import java.util.Random;

public class Channel {
private final Show[] shows;
private int numberOfChannel;
private String nameChannel;



  public Channel(int numberOfChannel, String nameChannel) {
    this.nameChannel = nameChannel;
    this.numberOfChannel = numberOfChannel;
    this.shows = new Show[5];
    shows[0] = new Show("Comedy Club");
    shows[1] = new Show("Новости");
    shows[2] = new Show("Кино");
    shows[3] = new Show("Погода");
    shows[4] = new Show("Сериал");
  }

  public int getNumberOfChannel() {
    return numberOfChannel;
  }

  public void setNumberOfChannel(int numberOfChannel) {
    this.numberOfChannel = numberOfChannel;
  }

  public String getNameChannel() {
    return nameChannel;
  }

  public void setNameChannel(String nameChannel) {
    this.nameChannel = nameChannel;
  }

  public String getTheSchow (int showId) {
    return shows[showId].getShowName();
  }
}
