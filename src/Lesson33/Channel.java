package Lesson33;

public class Channel {


  private int numberOfChannel;
  private String nameChannel;
  private Televesion televesion;
  private Show show;

  private final Channel[] channels = new Channel[5];


  public Channel(int numberOfChannel, String nameChannel) {
    this.numberOfChannel = numberOfChannel;
    this.nameChannel = nameChannel;
  }

  public Channel(Televesion televesion) {
    this.televesion = televesion;
    this.show = new Show(this);
    channels[0] = new Channel( 1, "Первый канал");
    channels[1] = new Channel( 2, "Второй канал");
    channels[2] = new Channel( 3, "РенТВ");
    channels[3] = new Channel( 4, "СТС");
    channels[4] = new Channel( 5, "ТНТ");
  }


  public void playTheChannel(int channelFromTV) {
    System.out.println("Включен канал: " + channelFromTV);
    for (Channel channel : channels) {
      if (channelFromTV == channel.getNumberOfChannel()) {
        System.out.println("Канал называется: " + channel.getNameChannel());
        show.playTheShow();
      }
    }
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

}
