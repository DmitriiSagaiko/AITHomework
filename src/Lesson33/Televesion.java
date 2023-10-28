package Lesson33;

public class Televesion {
    private Channel channel;

    private final RemoteControl remoteControl;


    public Televesion() {
        this.remoteControl = new RemoteControl(this);
        this.channel = new Channel(this);
    }

    public void turnOnChannel (int channelFromRemoteControl) {
       channel.playTheChannel(channelFromRemoteControl);
    }
}
