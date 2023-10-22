package Lesson33;

import java.nio.channels.Channels;
import java.util.Random;

public class Televesion {
    private final Channel[] channels;

    private final RemoteControl remoteControl;

    private final Random random = new Random();

    public Televesion() {
        this.channels = new Channel[5];
        channels[0] = new Channel(1, "Первый канал");
        channels[1] = new Channel(2, "Второй канал");
        channels[2] = new Channel(3, "РенТВ");
        channels[3] = new Channel(4, "СТС");
        channels[4] = new Channel(5, "ТНТ");
        this.remoteControl = new RemoteControl(this);
    }

    public void turnOnChannel (RemoteControl remoteControl) {
        int a = remoteControl.getChannelNumber();
        System.out.println("Включен канал: " + a);
        for (Channel channel : channels) {
            if (a == channel.getNumberOfChannel()) {
                System.out.println("Канал называется: " + channel.getNameChannel());
            }
        }
        System.out.println("Программа: " + channels[a-1].getTheSchow(random.nextInt(5) ));
        System.out.println();
    }
}
