package Lesson33;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Televesion televesion = new Televesion();
    RemoteControl remoteControl = new RemoteControl(televesion);
    remoteControl.on(0,televesion);
    remoteControl.on(1,televesion);
    remoteControl.on(2,televesion);
    remoteControl.on(3,televesion);
    remoteControl.on(4,televesion);
    remoteControl.on(5,televesion);


  }

}
