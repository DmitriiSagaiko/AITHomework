package Lesson53;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

  public static void main(String[] args) {

    Predicate<Person> predicate = person -> (person.getAge()>18) && person.getCity().equals("Berlin");

    System.out.println(filterThePeopleByPredicate1(getTheListOfPersons(), predicate));
    System.out.println("+++++++++++=");
    System.out.println(filterThePeopleByStream(personStream(getTheListOfPersons(),predicate)));


  }


  public static List<Person> filterThePeopleByPredicate1 (List<Person> input, Predicate<Person> predicate){

    return input.stream()
        .filter(predicate)
        .collect(Collectors.toList());
  }

  public static List<Person> filterThePeopleByStream(Stream<Person> inputStream) {

    return inputStream.collect(Collectors.toList());
  }

  public static Stream<Person> personStream(List<Person> input, Predicate<Person> predicate) {
     return
         input.stream()
        .filter(predicate);
  }

  public static List<Person> getTheListOfPersons() {
    return List.of(
        new Person("Oleg", 18, "Moscow"),
        new Person("Dmitrii", 10, "Hamburg"),
        new Person("Egor", 35, "Kiev"),
        new Person("Vladislav", 50, "Munchen"),
        new Person("Olesya", 40, "Hamburg"),
        new Person("Janna", 10, "Hamburg"),
        new Person("Sveta", 28, "Berlin"),
        new Person("Julia", 33, "Berlin")
    );
  }

}
