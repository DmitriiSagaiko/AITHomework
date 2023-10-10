package Lesson24.Task1;

public class MainHomeworkWithBus {

  public static void main(String[] args) {
    Bus bus = new Bus("BMW", 2005, 49, 25000);
    System.out.println(bus.getMilliage());
    bus.busDrive();
    System.out.println(bus.getMilliage());
  }

}
