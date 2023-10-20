package Lesson31_32;

public class MainLinkedList {

  public static void main(String[] args) {
    MyLinkedList<String> strings = new MyLinkedList<>();
    strings.add("Java");
    strings.add("Bye");
    strings.add("Hello");
    strings.add("Dima");
    strings.add("Mama");
    System.out.println(strings);
    System.out.println(strings.size());
    System.out.println(strings.remove("Bye"));
    System.out.println(strings);
    System.out.println(strings.size());
    System.out.println(strings.remove("Java"));
    System.out.println(strings);
    System.out.println(strings.size());
    System.out.println(strings.remove("Hello"));
    System.out.println(strings.remove("Dima"));
    System.out.println(strings.remove("Mama"));
    System.out.println(strings + ( "size =  " + strings.size()));





  }
}
