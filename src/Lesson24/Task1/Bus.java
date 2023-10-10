package Lesson24.Task1;

public class Bus extends Vehicle {

  int capacity;
  int countPassengers;

  private int milliage;

  public Bus() {
    // здесь идет вызов пустого конструктора Vehicle
    //super();
  }

  public Bus(String model, int yearOfManufacture, int capacity) {
    super(model, yearOfManufacture); // Вызывает конструктор класса Vehicle
    System.out.println("Вызов конструтора BUS");
    // Вызов конструктора идет впервую очередь
    // Присваивание полей идет во вторую очередь
    this.capacity = capacity;
  }

  public Bus(String model, int yearOfManufacture, int capacity, int milliage) {
    super(model, yearOfManufacture);
    this.capacity = capacity;
    this.milliage = milliage;
  }


  public void busDrive() {
    System.out.println("Автобус едет");
    milliage++; // По хорошему надо использовать родительский метод Start, и когда он запущен надо
    // добавлять пробег, но пока что свой метод оставим
  }


  public void takePassenger() {
    if (countPassengers < capacity) {
      countPassengers++;
      System.out.println("Пассажир зашел в автобус");
    } else {
      System.out.println("Автобус полный!");
    }
  }

  public void dropOffPassenger() {
    if (countPassengers > 0) {
      countPassengers--;
      System.out.println("Пассажир вышел из автбуса");
    } else {
      System.out.println("В автобусе больше нет пассажиров");
    }
  }

  public int getMilliage() {
    return milliage; // Геттер установим, для считывания. Сеттер ставить не будем, для того,
    // чтобы не скручивали пробег
  }

  public int getCapacity() {
    return capacity;
  }

  public int getCountPassengers() {
    return countPassengers;
  }
}
