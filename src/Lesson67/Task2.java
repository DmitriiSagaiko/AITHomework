package Lesson67;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task2 {

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    for (int i = 0; i < 20; i++) {
      executorService.submit(Task2::print);
    }
    executorService.shutdown();
  }

  public synchronized static void print() {
    System.out.print("A");
    System.out.print("B");
    System.out.print("C");
    System.out.println();
  }

}
