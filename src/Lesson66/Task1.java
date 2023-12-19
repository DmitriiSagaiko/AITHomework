package Lesson66;

public class Task1 {
  private int counter;
  public synchronized void increment() {
    counter++;
  }
  public synchronized void decrement() {
    counter--;
  }
  public static void main(String[] args) {
    Lesson66.Task1 task1 = new Lesson66.Task1();
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10000; i++) {
          task1.increment();
        }
      }
    });
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10000; i++) {
          task1.decrement();
        }

      }
    });
    thread.start();
    thread1.start();
    try {
      thread.join();
      thread1.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println(task1.counter);
  }
}
