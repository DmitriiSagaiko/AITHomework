package Lesson55.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Ivan", "IT", 5700));
    employees.add(new Employee("Petr", "IT", 6000));
    employees.add(new Employee("Janna", "IT", 6300));
    employees.add(new Employee("Alex", "management", 63000));
    employees.add(new Employee("Kira", "management", 65000));
    employees.add(new Employee("Boris", "cleaning", 600));

    groupByDepartment(employees);
  }

  private static void groupByDepartment(List<Employee> employees) {
    Map<String, List<Employee>> map = employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment));
    System.out.println(map);
  }

}
