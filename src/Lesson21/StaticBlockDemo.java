package Lesson21;

public class StaticBlockDemo {

  private String tittle;
  private static String[] strings;
  private int capacity;




  public StaticBlockDemo(String tittle, int capacity) {

    System.out.println(" constructor start!");
    this.tittle = tittle;
    this.capacity = capacity;
  }

  // Static Init Block! Пустится раньше, чем конструктор!
  static {
    System.out.println(" Static init block start!");
    strings = new String[3];
    strings[0] = "blue";
    strings[1] = "red";
    strings[2] = "yellow";
  }

  /// Не статический init block
  {
    System.out.println("non static print");
    this.tittle = "String";
    this.capacity = 10;
  }

  public void changeStrings(String str1, String str2) {
    strings[0] = str1;
    strings[1] = str2;
  }

  public static void printStrings() {
    for (String str : strings) {
      System.out.println(str + " ;");
    }
  }

  public String getTittle() {
    return tittle;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setTittle(String tittle) {
    this.tittle = tittle;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }


  public static void main(String[] args) {
    StaticBlockDemo sbd = new StaticBlockDemo("first ", 5);
    StaticBlockDemo.printStrings();
    sbd.changeStrings("black", "white");
    StaticBlockDemo.printStrings();

    StaticBlockDemo sbd1 = new StaticBlockDemo("second", 5);
    StaticBlockDemo.printStrings();
  }

}
