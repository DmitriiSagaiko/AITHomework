package Lesson20;

public class Cat {

  private String name;
  private int age;
  private int weight;

  public Cat(String name, int age, int weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  void sayMeow() {
    System.out.println(" MEOW!!");
  }


  // Get чтобы получить значение из поля
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getWeight() {
    return weight;
  }

  // Set чтобы установить имя

  public void setName(String newName) {

    this.name = newName;
  }

  public void setAge(int age) {
    if (age >= 0 && age <= 20) {
      this.age = age;
    }

  }

  public void setWeight(int weight) {
    if (weight>50 && weight < 0) {
      this.weight = weight;
    }

  }

}
