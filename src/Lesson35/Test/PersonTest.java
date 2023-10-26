package Lesson35.Test;

import static org.junit.jupiter.api.Assertions.*;

import Lesson35.Person;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class PersonTest {
 // ctl + alt + O - удаление не исп анотаций
  //@ - анотация
  //@BeforeEach - помечает метод, который будет выполняться перед каждым тестом
  // c анотацией test
  // так же существует аннотация @BeforeAll

  Person person;
  String startPassword = "qwertY1&1";
  String startEmail = "john@test.com";

//  @BeforeAll
//  void beforeAll() {
//    System.out.println("Этот метод выполнится перед запуском всех тестовых методов");
//  }
  //@AfterEach// Метод выполняется после каждого теста
  //@AfterAll // Метод выполнится 1 раз после всех тестов

  @BeforeEach
  void setUp() {
    person = new Person(startEmail,startPassword);
  }

  @Test
  void testSetValidEmail() {
    String validEmail = "valid@test.ru";
    person.setEmail(validEmail);
    assertEquals(validEmail, person.getEmail()); // Метод сравнивает 2 своих аргумента
    // ожидаемый и фактический.
  }

  @Test
  void testInvalidEmail() {
    String incorrectEmail = "invalid.test.de";
    person.setEmail(incorrectEmail);
    assertEquals(startEmail,person.getEmail());
  }

  @Test // @Disabled// @Disabled - указывает что тест или группа тестов отключены и не будут выполняться
  void testInvalidAtDoubleEmail() {//2 собаки
    String incorrectEmail = "invalid@test@.de";
    person.setEmail(incorrectEmail);
    assertEquals(startEmail,person.getEmail());
  }

  @ParameterizedTest
  @ValueSource(strings = {"invalid@mail.d", "invalid@mail.", "invalid@mail"})
  void testIncorrectEmailSetParam(String incorrectEmail) {
    //System.out.println("curent value: " + incorrectEmail);
    person.setEmail(incorrectEmail);
    assertEquals(startEmail, person.getEmail());
  }

  @Disabled
  @ParameterizedTest
  @ValueSource(ints = {1,2,3})
  void testIntsParam(int value){
    assertTrue(value<0);
  }

  @ParameterizedTest
  //@EnumSource// Источник данных для перечеслений.
  @MethodSource("GenerateDataForEmailTest") // Это последовательный поток данных
  void testIncorrectEmails(String a) {
    person.setEmail(a);
    assertEquals(startEmail, person.getEmail());
  }

  static Stream<String>GenerateDataForEmailTest () {
    return Stream.of("invali!@mail.de", "abca*@com.de","abca;@com.de");
  }

  @ParameterizedTest
  @CsvSource({"apple, 1", "bannana, 4", "cherry, 5"})
  void testCSVSource(String fruit, int count) {
    assertNotNull(fruit); // null то пройдено
    assertTrue(count>0); // null то пройдено
  }


  @ParameterizedTest
  @CsvFileSource(resources = "/Lesson35/Test/data.csv")
  void testCSVfile(String fruit, int count) {
    assertNotNull(fruit); // null то пройдено
    assertTrue(count>0); // null то пройдено
  }


  @Test
  void testValidPassword(){
    String validPassword = "ABc123&$";
    person.setPassword(validPassword);
    assertEquals(validPassword,person.getPassword());
  }


  @ParameterizedTest
  @ValueSource(strings = {"AB%caa1","AB%ca1","AB%c1","A%c1","AB%","A1", "&", ""})
  void testIncorrectPasswordLength(String incorrectPassword) {
    person.setPassword(incorrectPassword);
    assertEquals(startPassword, person.getPassword());
  }

  @Test
  void testIncorrectPasswordDigit() {
    String invalidPassword = "AB%caaG$";
    person.setPassword(invalidPassword);
    assertEquals(startPassword, person.getPassword());
  }

  @ParameterizedTest
  @ValueSource(strings = {"AB%CAAA1","abc%caaa1"})
  void testIncorrectPasswordCase(String incorrectPassword) {
    person.setPassword(incorrectPassword);
    assertEquals(startPassword, person.getPassword());
  }

  @ParameterizedTest
  @ValueSource(strings = {"AB#ac1@@","AB!abc1^","AB!abc1*","AB!abc1(","AB!abc1)","AB!abc1-","AB!abc1_","AB!abc1+","AB!abc1=","AB!abc1/","AB!abc1|","AB!abc1?",
      "AB!abc1,", "AB!abc1.", "AB!abc1>","AB!abc1<", "AB!abc1~", "AB!abc1# ", "AB!abc1;","AB!abc1:"})  //!%@$&
  //^()-_=+/|?,.><~#;:
  void testIncorrectPasswordSymbol(String incorrectPassword) {
    person.setPassword(incorrectPassword);
    assertEquals(startPassword, person.getPassword());
  }

  @ParameterizedTest
  @MethodSource("Lesson35.Test.TestDataProvider#dataForTest") // Можно тянуть методы из других файлов
  void exampleGetValueByStream(int[] ints, String s, boolean isActive, Person person) {
    System.out.println(Arrays.toString(ints));
    System.out.println(s + " : " + isActive);
    System.out.println(person);
  }



//  static Stream<Arguments>dataForTest() { // Передача разроненных данных
//    return Stream.of(
//        Arguments.of(new int[] {1,3,5,6}, "hello", true, new Person("trt", "sdfsdf")),
//        Arguments.of(new int[] {0,2,4,6}, "Java", false,null),
//        Arguments.of(new int[] {5,5,5,5}, "Python", false, null)
//    );
//  }

  @ParameterizedTest
  @MethodSource("dataForArraysEquals")
  void exampleArrayEquals(int[] arr1, int[] arr2) {
    //Assertions.assertEquals(arr1,arr2); // так не получится сравнить массивы
    assertArrayEquals(arr1, arr2); // Чтобы не писать Assertions мы можем его импортировать
  }
  static Stream<Arguments> dataForArraysEquals () {
    return Stream.of(
        Arguments.of(new int[] {5,3,9,0}, new int[] {5,3,9,0}),
        Arguments.of(new int[] {5,3,9,1}, new int[] {5,3,9,0})
    );
  }


}