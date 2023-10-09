package Lesson20;

public class MainCat {

  public static void main(String[] args) {
    Cat cat1 = new Cat("max", 4, 8);
    cat1.sayMeow();
    //cat1.name = "lol"; // заблокировано из за private

    System.out.println(cat1.getName() + " Имя");
    System.out.println(cat1.getAge() + " Возраст");
    System.out.println(cat1.getWeight() + " Вес");

    // Установим имя
    cat1.setName("BARSIK");
    cat1.setAge(21);
    cat1.setWeight(51);
    System.out.println(cat1.getName());
    System.out.println(cat1.getAge());
    System.out.println(cat1.getWeight());
  }

}
