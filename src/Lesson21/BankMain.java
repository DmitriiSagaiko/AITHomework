package Lesson21;

public class BankMain {

  public static void main(String[] args) {
    BankAccount ba = new BankAccount(112574,5000,"Euro"," DS", 15255,"sweedBank");
    BankAccount ba1 = new BankAccount(112574,5000,"Euro"," DS", 15255,"sweedBank");
    System.out.println(ba.toString());
    System.out.println(ba1.toString());
  }

}
