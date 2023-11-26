package Lesson55.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Transaction> transactions = new ArrayList<>();
    transactions.add(new Transaction(5000, Type.DEBIT));
    transactions.add(new Transaction(6000, Type.CREDIT));
    transactions.add(new Transaction(1000, Type.CREDIT));
    transactions.add(new Transaction(1500, Type.CREDIT));
    transactions.add(new Transaction(2000, Type.CREDIT));
    transactions.add(new Transaction(500, Type.DEBIT));
    transactions.add(new Transaction(500, Type.DEBIT));

    info(transactions);
  }

  private static void info(List<Transaction> transactions) {

    Map<Type, Double> map = transactions.stream()
        .collect(Collectors.groupingBy(Transaction::getType,
            Collectors.summingDouble(Transaction::getAmount)));
    Optional<Transaction> max = transactions.stream()
        .max(Comparator.comparingInt(Transaction::getAmount));
    System.out.println("транзакция с максимальной суммой: " + (max.isPresent() ? max.get() : 0));
    System.out.println("сумма по дебиту: " + map.get(Type.DEBIT));
    System.out.println("сумма по кредиту: " + map.get(Type.CREDIT));
    System.out.println("Общая сумма: " + (map.get(Type.CREDIT) + map.get(Type.DEBIT)));


  }


}
