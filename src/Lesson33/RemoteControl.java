package Lesson33;

public class RemoteControl {
private final Televesion televesion;

private int channelNumber;

  public RemoteControl(Televesion televesion) {
    this.televesion = televesion;
  }

  public void on(int channelNumber) {
    System.out.println("На пульте выставлен канал: " + channelNumber);
    if (channelNumber <= 0 || channelNumber > 5) {
      System.out.println("Такого канала нет");
      System.out.println();
      return;
    }
    setChannelNumber(channelNumber);
    televesion.turnOnChannel(channelNumber);

  }

  public int getChannelNumber() {
    return channelNumber;
  }

  public void setChannelNumber(int channelNumber) {
    this.channelNumber = channelNumber;
  }
}
