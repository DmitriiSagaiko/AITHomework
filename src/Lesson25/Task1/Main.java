package Lesson25.Task1;

public class Main {

  public static void main(String[] args) {
    Construction construction = new Construction("Больница", " Кирпич", 25);
    System.out.println(construction.info());

    Hospital hospital = new Hospital("Шаритэ", " Бетон", 35, 250, 8);

    System.out.println(hospital.info());
    hospital.income(5);
    hospital.income(5);
    hospital.income(5);
    System.out.println(hospital.info());

    Manufactury manufactury = new Manufactury("Завод Mercedes", "Композит", 30, 1000, 500);
    System.out.println(manufactury.info());
    manufactury.work(499);
    System.out.println(manufactury.info());
    manufactury.work(501);
    System.out.println(manufactury.info());

  }


}
