package Lesson67;

public class Task1 {

  private final static Object OBJECT = new Object();

  int a = 0;
  int b = 0;
  int c = 0;

  Thread threadA = new Thread(new Runnable() {
    @Override
    public void run() {
      while (a < 20) {
        synchronized (OBJECT) {
          System.out.print("A");
          a++;
          try {
            OBJECT.wait();
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          } finally {
            OBJECT.notifyAll();
          }
        }
        OBJECT.notifyAll();
      }
    }
  });

  Thread threadB = new Thread(new Runnable() {
    @Override
    public void run() {
      while (b < 20) {
        synchronized (OBJECT) {
          System.out.print("B");
          b++;
          try {
            OBJECT.wait();
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          } finally {
            OBJECT.notifyAll();
          }
        }
        OBJECT.notifyAll();
      }
    }
  });

  Thread threadC = new Thread(new Runnable() {
    @Override
    public void run() {
      while (c < 20) {
        synchronized (OBJECT) {
          System.out.print("C");
          c++;
          try {
            OBJECT.wait();
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          } finally {
            OBJECT.notifyAll();
          }
        }
      OBJECT.notifyAll();
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

  }
}


