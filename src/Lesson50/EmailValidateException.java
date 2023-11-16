package Lesson50;

public class EmailValidateException extends Exception {
/*
      getMessage() - возврат строки с ошибкой (мало инфы)
      getCause() - Возвращает исключение, которое вызвало текущее исключение
      toString() - возвращает строку с описанием ошибки
      printStackTrace() - выводит трассировку ошибки
 */

  public EmailValidateException(String message) {
    super(message);
  }

  @Override
  public String getMessage() {
    return "Password validate exception " + super.getMessage();
  }
}
