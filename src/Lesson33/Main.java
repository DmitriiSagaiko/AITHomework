package Lesson33;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Televesion televesion = new Televesion();
    RemoteControl remoteControl = new RemoteControl(televesion);
    remoteControl.on(0);
    remoteControl.on(1);
    remoteControl.on(2);
    remoteControl.on(3);
    remoteControl.on(4);
    remoteControl.on(5);


  }

}
