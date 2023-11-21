package Lesson52;

import java.util.function.Function;

public class Task2 {

  public static void main(String[] args) {
    String string = " Большая-пребольшая строка, с кучей символов... Разных!   и даже, ненужными пробелами ";
    Function<String,String> trimSpaces = string1 -> string1.replaceAll("\\s", "");
    Function<String,String> toUpperCase = String::toUpperCase;
    Function<String,String> beforeLength = trimSpaces.andThen(toUpperCase);
    Function<String,Integer> combined = trimSpaces.andThen(toUpperCase).andThen(string1 -> string1.length());
    System.out.println(string);
    System.out.println(beforeLength.apply(string));
    System.out.println(combined.apply(string));


  }

}
