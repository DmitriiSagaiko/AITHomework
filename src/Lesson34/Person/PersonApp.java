package Lesson34.Person;

public class PersonApp {

  public static void main(String[] args) {
    Person person = new Person("dima@mail.co","passwrod");
    System.out.println(person);
    person.setEmail("aa&a@mail.c");
    System.out.println(person);

    System.out.println(person.getPassword());
    person.setPassword("1235Aba$");
    System.out.println(person.getPassword());


  }
}
