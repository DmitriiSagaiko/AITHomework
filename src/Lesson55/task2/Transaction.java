package Lesson55.task2;

public class Transaction {
  private int amount;
  private Type type;

  @Override
  public String toString() {
    return "Transaction{" +
        "amount=" + amount +
        ", type=" + type +
        '}';
  }

  public Transaction(int amount, Type type) {
    this.amount = amount;
    this.type = type;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }
}
