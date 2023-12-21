package Lesson68;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    boolean[] park = new boolean[5];
    int amountOfThreads = 10;
    Car[] cars = new Car[10];
    cars = makeCars(cars,park);
    //Arrays.stream(cars).forEach(i -> System.out.println(i.showId()));

    Thread[] threads = makeThreads(amountOfThreads,park);
    startThreads(threads);
    waitUntilFinish(threads);
  }

  public static Car[] makeCars(Car[] cars, boolean[] park) {
    for (int i = 0; i < cars.length; i++) {
      cars[i] = new Car(park);
    }
    return cars;
  }

  public static Thread[] makeThreads (int amountOfThreads, boolean[] park) {
    return IntStream.range(0,amountOfThreads)
        .mapToObj(i-> new Thread(new Car(park)))
        .toArray(Thread[]::new);
  }
  private static void startThreads(final Thread[] threads) {
    Arrays.stream(threads)
        .forEach(Thread::start);
  }
  private static void waitUntilFinish(final Thread thread) {
    try {
      thread.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  private static void waitUntilFinish(final Thread[] threads) {
    Arrays.stream(threads)
        .forEach(Main::waitUntilFinish);
  }

}
