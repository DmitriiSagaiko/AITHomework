package Lesson29;

public class Main  {

  public static void main(String[] args) {
    PaymentSystem bankAccount = new BankAccount("DE123456789", 5000);
    PaymentSystem electronicWallet = new ElectronicWallet(1234447569,10000);
    bankAccount.checkBalance();
    electronicWallet.checkBalance();
    bankAccount.transferMoney(15000, electronicWallet);
    electronicWallet.checkBalance();




  }

}
