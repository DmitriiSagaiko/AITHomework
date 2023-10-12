package Lesson25.Task0;

public class Bus {

  private final int id;

  private final String model;

  private int miliage;

  private final int capacity;

  private BusDriver driver; // Агрегация
  private Passenger[] passengers; // Агрегация

  private static int counter;
  private int amountPassenger;

  private static int ticketCounter;

  private AutoPilot autoPilot; // композиция

  ///////////////////// конструкторы

  public Bus(String model, int capacity) {
    this.model = model;
    this.capacity = capacity;
    this.id = counter++;
    passengers = new Passenger[capacity];
    this.autoPilot = new AutoPilot(" 001 beta"); //композиция
  }

  public Bus(String model, int capacity, BusDriver driver) {
    this.model = model;
    this.driver = driver;
    this.capacity = capacity;
    this.id = counter++;
    passengers = new Passenger[capacity];
    this.autoPilot = new AutoPilot(" 001 beta");// Композиция
  }



  public boolean takePassenger(Passenger passenger) { // В метод пришел объект класса Passenger
    if (passenger.getTicketNumber() != null) return false; // Если пассажир уже с билетом, ехать нельзя

    if (amountPassenger < capacity) {
      passengers[amountPassenger] = passenger;
      passenger.setTicketNumber(generateTicketNumber(passenger.getId()));
      passengers[amountPassenger++] = passenger;

      return true;
    }

    return false;
  }

  /// Метод модифицировали
  public boolean dropPassenger(Passenger passenger) {
    int indexPassenger = isPassengerInBus(passenger.getId());
    Passenger[] outputPassenger = new Passenger[capacity];
    if (indexPassenger > 0) {
      passengers[indexPassenger] = null;
      passenger.setTicketNumber(null);
      for (int i = 0; i < indexPassenger; i++) {
        outputPassenger[i] = passengers[i];
      }
      for (int i = indexPassenger; i < passengers.length - 1; i++) {
        outputPassenger[i] = passengers[i + 1];
      }
      outputPassenger[outputPassenger.length
          - 1] = null; //чтобы они сидения не выносили из автобуса
      passengers = outputPassenger;
      amountPassenger--;
      return true;
    }
    return false;
  }


  private int isPassengerInBus(int idPassenger) {
    for (int i = 0; i < amountPassenger; i++) {
      if (passengers[i].getId() == idPassenger) {
        return i;
      }
    }
    return -1;
  }

  private String generateTicketNumber(int passengerId) {

    return "Bus" + id + "-" + passengerId + String.format("%05d", ++ticketCounter);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Bus id ").append(id).append(" Model ").append(model);
    sb.append(" Capacity ").append(capacity);
    sb.append("; Driver ").append(driver == null ? "net; " : driver);
    sb.append(" Список пассажиров: ").append(getStringPassengerList());
    sb.append(" Это композиция с автопилотом").append(autoPilot);

    return sb.toString();
  }

  private String getStringPassengerList() {
    StringBuilder sb = new StringBuilder("{");
    for (Passenger passenger : passengers) {
      if (passenger != null) {
        sb.append(passenger).append("; ");
      }
    }
    // Если в sb есть хоть один пассажир, то изм длину на 2 последних символа
    if (sb.length() > 1) {
      sb.setLength(sb.length() - 2);
    }
    sb.append("}");
    return sb.toString();
  }

  public int getId() {
    return id;
  }

  public String getModel() {
    return model;
  }


  public int getMiliage() {
    return miliage;
  }

  public void setMiliage(int miliage) {
    this.miliage = miliage;
  }

  public int getCapacity() {
    return capacity;
  }

  public BusDriver getDriver() {
    return driver;
  }

  public void setDriver(BusDriver driver) {
    this.driver = driver;
  }

  public Passenger[] getPassengers() {
    return passengers;
  }
}
