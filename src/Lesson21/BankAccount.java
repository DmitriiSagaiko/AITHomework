package Lesson21;

public class BankAccount {

  private final int id;
  private long accountNumber;

  private double amount; // деньги на счету
  private String currency; // счет

  private String owner;

  private int bankBranch;

  private String bank;


  private static int counter;

  public BankAccount(long accountNumber, double amount, String currency, String owner,
      int bankBranch,
      String bank) {
    this.accountNumber = accountNumber;
    this.amount = amount;
    this.currency = currency;
    this.owner = owner;
    this.bankBranch = bankBranch;
    this.bank = bank;
    this.id = counter++;

  }

  public String toString() {
    return "Account id:" + id  + " ammount + " + amount + " + owner + " + owner + " bank" + bank;
  }
}
