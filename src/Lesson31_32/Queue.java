package Lesson31_32;

public interface Queue <T> {
  void addLast(T value);
  void addFirst(T value);
  T getFirst();
  T getLast();
  T remove(); // Удаляет первый элемент списка
  T removeFirst();
  T removeLast(); //Удаляет последний элемент списка

}
