package Lesson55.task3;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Ivan", "IT", 5700));
    employees.add(new Employee("Petr", "IT", 6000));
    employees.add(new Employee("Janna", "IT", 6300));
    employees.add(new Employee("Alex", "management", 63000));
    employees.add(new Employee("Kira", "management", 65000));
    employees.add(new Employee("Boris", "cleaning", 600));

    findMaxAverageSalary(employees);
  }

  private static void findMaxAverageSalary(List<Employee> employees) {
    Map<String, Double> map = employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment,
            Collectors.averagingDouble(Employee::getSalary)));

    System.out.println("Средняя ЗП по отделам" + map);

    Optional<Entry<String, Double>> max = map.entrySet().stream()
        .max((emp1, emp2) -> (int) (emp1.getValue() - emp2.getValue()));
    System.out.println(
        "отдел с максимальной ЗП: " + (max.isPresent() ? max.get() : "такого отдела нет"));


  }

}
