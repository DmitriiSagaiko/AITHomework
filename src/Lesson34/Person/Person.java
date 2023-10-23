package Lesson34.Person;

public class Person {

  private String email;
  private String password;

  public Person(String email, String password) {
    setEmail(email);
    setPassword(password);
  }

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    if (isEmailVaild(email)) {
      this.email = email;
    }

  }


  //vasya.pupkin@gmail.com;
  //1 должна быть "@" и только одна
  // 2 Должна быть как минимум одна точка после @
  // 3 Должно быть минимум 2 символа после последней точки
  // 4 Аннгл алфавит, "_", "-", ".", "@", 0-9
  // 5 до "@" должно быть как минимум 1 символ
  private boolean isEmailVaild(String email) {
    int indexAt = email.indexOf('@');
    //eeee@fff@.com
    // в indexAt лежит первое вхождение @. И если первое вхождение не ровно последнему, тогда их две, тогда false.
    if (indexAt == -1 || indexAt != email.lastIndexOf('@')) {
      return false;
    }
    // Ищу точку сразу после @, если нет, то False
    if (email.indexOf('.', indexAt) == -1) {
      return false;
    }
    //Индекс последнего length -1
    int lastPoint = email.lastIndexOf('.');
    if (lastPoint >= email.length() - 2) {
      return false;
    }

    for (int i = 0; i < email.length(); i++) {
      char c = email.charAt(i);
      if (!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '.' || c == '_' ||
          c == '-' || c == '@')) {
        return false;
      }
    }

    return true;
  }

  public String getPassword() {
    return password;
  }


  // 1 Длина больше или равна 8
  // Должна быть минимум 1 цифра
  // Должна быть минимум 1 буква маленькая и одна Большая
  // Должен быть мин 1 спец символ  из !%@$&
  public void setPassword(String password) {
    if (isPasswordValid(password)) {
      this.password = password;
    }
  }

  private boolean isPasswordValid(String password) {
    if (password.length() <= 7) {
      return false;
    }

    boolean isDigit = false;
    boolean isLowCase = false;
    boolean isUpperCase = false;
    boolean isSymbol = false;

    for (int i = 0; i < password.length(); i++) {
      char x = password.charAt(i);

      if (Character.isDigit(x)) {
        isDigit = true;
      }
      if (Character.isLowerCase(x)) {
        isLowCase = true;
      }
      if (Character.isUpperCase(x)) {
        isUpperCase = true;
      }
      if (x == '!' || x == '%' || x == '@' || x == '$' || x == '&') {
        isSymbol = true;
      }
    }

    return isDigit && isLowCase && isUpperCase && isSymbol;
  }

  @Override
  public String toString() {
    return "Person{" +
        "email='" + email + '\'' +
        '}';
  }

}
