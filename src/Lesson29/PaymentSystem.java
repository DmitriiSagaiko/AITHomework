package Lesson29;

public interface PaymentSystem {

  void transferMoney(int amount, PaymentSystem recipient);
  void withdrawMoney(int amount);
  void checkBalance();

  void acceptTransferEUR(int amount);
  void acceptTransferBTC(int amount);

}
