package Lesson69;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Restaurant {

  public final static int POSITIONS = 3;

  public final static int VISITORS = ThreadLocalRandom.current().nextInt(15,31);


  public final static AtomicInteger MAX_SERVICE_TIME = new AtomicInteger();
  public final static AtomicInteger CURRENT_AMOUNT_OF_VISITORS = new AtomicInteger();



  static class Kitchen {

    public final static Semaphore SEMAPHORE_COOK = new Semaphore(POSITIONS);

    public void cook() {
      try {
        System.out.println("Клиент: " + Thread.currentThread().getId() + " Ждет очереди на заказ");
        SEMAPHORE_COOK.acquire();
        int timeToCook = ThreadLocalRandom.current().nextInt(0,1001);
        System.out.println("Клиент: " + Thread.currentThread().getId() + " заказал и ждет пока приготовят " + timeToCook);
        Thread.sleep(timeToCook);
        System.out.println("Клиент: " + Thread.currentThread().getId() + " покушал. Встает из-за стола ");
        MAX_SERVICE_TIME.addAndGet(timeToCook);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      } finally {
        SEMAPHORE_COOK.release();
      }
    }

  }
  static {
    Runtime.getRuntime().addShutdownHook(new Thread(() ->{
      System.out.println("суммарное Кол-во посетителей: " + VISITORS);
      System.out.println("Среднее время обслуживания: " + (MAX_SERVICE_TIME.doubleValue()/CURRENT_AMOUNT_OF_VISITORS.doubleValue()));
    }));
  }
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(VISITORS);
    for (int i = 0; i < VISITORS; i++) {
      CURRENT_AMOUNT_OF_VISITORS.getAndIncrement();
      executorService.submit(new Visitor());
    }
    executorService.shutdown();
    try {
      executorService.awaitTermination(1, TimeUnit.DAYS);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("Конец Main");
  }

}

class Visitor implements Runnable {
  public final static Semaphore SEMAPHORE_TABLES = new Semaphore(5);
  Restaurant.Kitchen kitchen = new Restaurant.Kitchen();
  @Override
  public void run() {
    try {
      System.out.println("Клиент: " + Thread.currentThread().getId() + " зашел в ресторан");
      SEMAPHORE_TABLES.acquire();
      int timeToTakeTable = ThreadLocalRandom.current().nextInt(1001,3001);
      System.out.println("Клиент: " + Thread.currentThread().getId() + " Сел за стол на время " + timeToTakeTable);
      Thread.sleep(timeToTakeTable);
      kitchen.cook();
      System.out.println("Клиент: " + Thread.currentThread().getId() + " Ушел из ресторана ");
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }finally {
      SEMAPHORE_TABLES.release();
    }

  }
}
