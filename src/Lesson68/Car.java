package Lesson68;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {

  AtomicInteger atomicInteger = new AtomicInteger();
  private static int counter = 0;
  private int id;


  boolean[] parkSpace;

  public Car(boolean[] parkSpace) {
    this.parkSpace = parkSpace;
    this.id = counter;
    counter++;
  }

  @Override
  public void run() {
    parking(parkSpace);
  }

  private int parkingTime = ThreadLocalRandom.current().nextInt(3, 11);

  private boolean isParked;
  private long startedTime;

  int positionOnThePark;


  public boolean parking(boolean[] park) {
    for (int i = 0; i < park.length; i++) {
      if (!park[i]) { // нахожу свободное место
        park[i] = true;
        isParked = true;
        startedTime = System.nanoTime();
        positionOnThePark = i;
        unparking(park);
      }
    }
    System.out.println("Нет свободных мест, машина " + id + " переходит в режим ожидания");
    //waitForPlace();
    return false;
  }



  public boolean unparking(boolean[] park) {
    long endedTime = System.nanoTime();
    System.out.println("Машина " + id + " стоит на парковке " + positionOnThePark);
    while ((endedTime - startedTime) <= parkingTime * (10 ^ 9)) {

    }
    System.out.println("Машина " + id + " Уезжает с парковки " + positionOnThePark);
    isParked = false;
    park[positionOnThePark] = false;
    return false;
  }

  public int getParkingTime() {
    return parkingTime;
  }
}
