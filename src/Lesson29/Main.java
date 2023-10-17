package Lesson29;

public class Main  {

  public static void main(String[] args) {
    PaymentSystem bankAccount = new BankAccount("DE123456789", 5000);
    PaymentSystem electronicWallet = new ElectronicWallet(1234447569,10000);
    PaymentSystem[] array = new PaymentSystem[2];

    array[0] = bankAccount;
    array[1] = electronicWallet;

    for(PaymentSystem local : array) {
      local.checkBalance();
      local.transferMoney(1000);
      local.withdrawMoney(500);
      System.out.println("+++++++++++++++++++++++++++++++=");
    }

  }

}
