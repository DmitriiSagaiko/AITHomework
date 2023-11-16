package Lesson50;

public class EmailValidator {

  public static void validate(String email) throws EmailValidateException {
    int indexAt = email.indexOf('@');
    //eeee@fff@.com
    // в indexAt лежит первое вхождение @. И если первое вхождение не ровно последнему, тогда их две, тогда false.
    if (indexAt == -1 || indexAt != email.lastIndexOf('@')) {
      throw new EmailValidateException("@ error");
    }
    // Ищу точку сразу после @, если нет, то False
    if (email.indexOf('.', indexAt) == -1) {
      throw new EmailValidateException(". Нет точки после собаки");
    }
    //Индекс последнего length -1
    int lastPoint = email.lastIndexOf('.');
    if (lastPoint >= email.length() - 2) {
      throw new EmailValidateException("need to have 2 symbol after DOT");
    }

    for (int i = 0; i < email.length(); i++) {
      char c = email.charAt(i);
      if (!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '.' || c == '_' ||
          c == '-' || c == '@')) {
        throw new EmailValidateException("email doesnot contain ._-@");
      }
    }

  }
}

