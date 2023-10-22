package Lesson31_32;

public class MyLinkedList<T> implements MyList<T>,Queue<T> {

  private int size;
  private Node<T> first;
  private Node<T> last;


  @Override
  public boolean remove(T value) {
    if (contains(value)) {
      int a = indexOf(value);
      remove(a);
      return true;
    }
    return false;
  }

  @Override
  public T remove(int index) {
    T output = null;
    if (size == 0 || size - 1 < index) {
      output = null;
      // вне списка
    }
    if (size == 1) {
      output = first.value;
      removeFirst(); // Если первый
      return output;
    }
    if (index == size - 1) {
      output = last.value;
      removeLast(); // Если последний
      return output;
    }
    if (index == 0) {
      output = first.value;
      removeFirst();
      return output;
    } else {
      Node<T> cursor = first;
      int i = 0;
      while (i != index) {
        cursor = cursor.next;
        i++;
      }
      output = cursor.value;
      cursor.previous.next = cursor.next;
      cursor.next.previous = cursor.previous;

    }

    size--;
    return output;
  }

  @Override
  public T get(int index) {
    T output = null;
    if (size == 0 || size - 1 < index) {
      output = null;
      return output;
    }
    Node<T> cursor = first;
    int i = 0;
    while (i != index) {
      cursor = cursor.next;
      i++;
    }
    output=cursor.value;
    return output;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    if (first != null) {
      sb.append(first.value);
      Node<T> cursor = first.next;
      while (cursor != null) {
        sb.append(", ");
        sb.append(cursor.value);
        cursor = cursor.next;
      }
    }
    sb.append("]");
    return sb.toString();
  }


  @Override
  public void addAll(T... values) {
    for (T value : values) {
      add(value);
    }
  }


  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public int indexOf(T value) {
    int index = 0;
    Node<T> cursor = first;
    while (cursor != null) {
      if (cursor.value.equals(value)) {
        return index;
      }
      index++;
      cursor = cursor.next;
    }
    return -1;
  }

  @Override
  public int lastIndexOf(T value) {
    if (isEmpty()) {
      return -1;
    }
    int index = size - 1;
    Node<T> cursor = last;
    while (cursor != null) {
      if (cursor.value.equals(value)) {
        return index;
      }
      index--;
      cursor = cursor.previous;
    }
    if (size == 1) {
      if (first.value.equals(value)) {
        return 0;
      }
    }
    return -1;
  }

  @Override
  public boolean contains(T value) {
    return (indexOf(value) >= 0);
  }

  @Override
  public T[] toArray() {
    T[] result = (T[]) new Object[size];
    Node<T> cursor = first;
    int i = 0;
    while (cursor != null) {
      result[i] = cursor.value;
      i++;
      cursor = cursor.next;
    }
    return result;

  }

  @Override
  public void addLast(T value) {
    add(value);
  }

  @Override
  public void addFirst(T value) {
    if (first == null) {
      first = new Node<>(value, null, null);
    } else if (last == null) {
      last = first;
      first = new Node<>(value, null, last);
      last.previous = first;
    } else {
      Node<T> temp = first;
      first = new Node<>(value, null, temp);
      temp.previous = first;
    }
    size++;
  }

  @Override
  public T getFirst() {
    return (first == null ? null : first.value);
  }

  @Override
  public T getLast() {
    return (last == null ? null : last.value);
  }// должен возвращать и один элемент.

  @Override
  public T remove() { // Удалить самый левый узел и вернуть значение этого узла
    if (size == 0) {
      return null;
    }
    T value = first.value;
    if (size == 1) {
      first = null;
    } else if (size == 2) {
      first = last;
      first.previous = null;
      last = null;
    } else {
      first = first.next;
      first.previous = null;
    }
    size--;
    return value;
  }

  @Override
  public T removeFirst() {
    return remove();
  }

  @Override
  public T removeLast() {
    if (size == 0) {
      return null;
    }
    T value;
    if (size == 1) {
      value = first.value;
      first = null;
    } else if (size == 2) {
      value = last.value;
      last = null;
      first.next = null;
    } else {
      value = last.value;
      last = last.previous;
      last.next = null;
    }
    size--;
    return value;
  }

  // метод добавляет элемент в конец списка
  @Override
  public void add(T value) {
    if (first == null) {
      first = new Node<>(value, null, null); // Первый ссылается никуда
    } else if (last == null) {
      last = new Node<>(value, first, null); // последний ссылается на первый
      first.next = last; // первый ссылается на последнего
      // создали 2 узла: первый и последний
    } else {
      Node<T> temp = last;

      last = new Node<>(value, temp, null);
      temp.next = last;

    }
    size++;


  }

  private class Node<T> {

    T value;
    Node<T> previous;
    Node<T> next;

    public Node(T value, Node<T> previous, Node<T> next) {
      this.value = value;
      this.previous = previous;
      this.next = next;
    }

    @Override
    public String toString() {
      return "Node{" +
          "value=" + (value != null ? value : "null") +
          ", previous=" + (previous != null ? previous.value : "null") +
          ", next=" + (next != null ? next.value : "null") +
          '}';
    }


  }

}
