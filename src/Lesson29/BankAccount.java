package Lesson29;

public class BankAccount implements PaymentSystem {

  private String iban;
  private static final String currency = "EUR";

  private int balance;

  public BankAccount(String iban, int balance) {
    if(balance < 0) {
      this.balance = 5000;
      this.iban = iban;
    } else {
      this.iban = iban;
      this.balance = balance;
    }

  }

  @Override
  public void transferMoney(int amount, PaymentSystem recipient) {
    System.out.println("Перевожу " + amount + " " + currency + "  со счета " + iban);
    balance -= amount;
    recipient.acceptTransferEUR(amount);
    checkBalance();

  }

  @Override
  public void withdrawMoney(int amount) {
    System.out.println("Снимаю " + amount + " " + currency + " в банкомате");
    balance -= amount;
    checkBalance();
  }

  @Override
  public void checkBalance() {
    System.out.println("Текщий баланс на счете " + iban + " : " + balance + " " + currency);

  }

  @Override
  public void acceptTransferEUR(int amount) {
    balance += amount;
  }

  @Override
  public void acceptTransferBTC(int amount) {
    balance += amount*1000; //мой курс
  }
}
