package Lesson67;

public class Task1 {

  public static void main(String[] args) throws InterruptedException {
    Print print = new Print();
    for (int i = 0; i < 20; i++) {
      print.startAll();
    }
  }

}

class Print {

  public void startAll() {
    Thread thread1 = new Thread(() -> print("A"));
    Thread thread2 = new Thread(() -> print("B"));
    Thread thread3 = new Thread(() -> print("C"));
    thread1.start();
    try {
      thread1.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    thread2.start();
    try {
      thread2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    thread3.start();
    try {
      thread3.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println();
  }

  private synchronized void print (String letter){
    System.out.print(letter);
  }

}
