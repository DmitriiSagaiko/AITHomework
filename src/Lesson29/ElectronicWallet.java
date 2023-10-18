package Lesson29;

public class ElectronicWallet implements PaymentSystem {

  private final int accountNumber;

  private static final String currency = "BTC";

  private  int balance;


  public ElectronicWallet(int accountNumber, int balance) {
    if (balance<0 || accountNumber < 0) {
      this.balance = 5000;
      this.accountNumber = 77788899;
    } else {
      this.accountNumber = accountNumber;
      this.balance = balance;
    }

  }

  @Override
  public void transferMoney(int amount, PaymentSystem recipient) {
    System.out.println("Перевожу " + amount + " " + currency + "  со счета " + accountNumber);
    balance=balance-amount;
    recipient.acceptTransferBTC(amount);
    checkBalance();
  }

  @Override
  public void withdrawMoney(int amount) {
    System.out.println("Снимаю " + amount + " " + currency + " в банкомате");
    balance=balance-amount;
    checkBalance();
  }

  @Override
  public void checkBalance() {
    System.out.println("Текщий баланс на счете " + accountNumber + " : " + balance + " " + currency);
  }

  @Override
  public void acceptTransferEUR(int amount) {
    balance = amount/1000 + balance;
  }

  @Override
  public void acceptTransferBTC(int amount) {
    balance += amount;
  }
}
