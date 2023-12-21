package Lesson67;

public class Task1 {

  private final static Object OBJECT = new Object();

  volatile String  string = "A";

  Thread threadA = new Thread(new Runnable() {
    @Override
    public void run() {
      while (string.length()<60) {
        synchronized (OBJECT) {
          while (!string.endsWith("C")) {
            try {
              OBJECT.wait();
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
          }
          string += "A";
          OBJECT.notifyAll();
        }
      }
    }

  });

  Thread threadB = new Thread(new Runnable() {
    @Override
    public void run() {
      while (string.length()<60) {
        synchronized (OBJECT) {
          while (!string.endsWith("A")) {
            try {
              OBJECT.wait();
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
          }
          string += "B";
          OBJECT.notifyAll();
        }
      }
    }
  });

  Thread threadC = new Thread(new Runnable() {
    @Override
    public void run() {
      while (string.length()<=60) {
        synchronized (OBJECT) {
          while (!string.endsWith("B")) {
            try {
              OBJECT.wait();
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
          }
          string += "C";
          OBJECT.notifyAll();
        }
      }
    }
  });

  public static void main(String[] args) {
    Task1 task1 = new Task1();
    task1.threadA.start();
    task1.threadB.start();
    task1.threadC.start();

    try {
      task1.threadA.join();
      task1.threadB.join();
      task1.threadC.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println(task1.string.length());

  }
}


