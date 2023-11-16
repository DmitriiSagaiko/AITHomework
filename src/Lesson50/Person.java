package Lesson50;

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
    try {
      EmailValidator.validate(email);
      // До след строки не дойдем, если получится ошибка
      this.email = email;
    } catch (EmailValidateException e) {
      e.printStackTrace();
    }

  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    try {
      PasswordValidator.validate(password);
      this.password = password;
    } catch (PasswordValidateExcepton e) {
      e.printStackTrace();
    }
  }

  @Override
  public String toString() {
    return "Person{" +
        "email='" + email + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
