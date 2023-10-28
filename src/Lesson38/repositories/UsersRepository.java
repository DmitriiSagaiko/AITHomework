package Lesson38.repositories;

import Lesson38.models.User;

public class UsersRepository {

  private static final int MAX_USERS_COUNT = 10;
  private User[] users;  // хранилище пользователей
  private int usersCount;

  public UsersRepository() {
    this.users = new User[MAX_USERS_COUNT];
  }

  public void save(User user) {
    this.users[usersCount] = user;
    this.usersCount++;
  }

  /**
   *Метод для проверки существования пользователя по email
   * @param email email,по которому мы ищем
   * @return true если есть и false если нет
   */
  public boolean isExistsByEmail (String email) {
    for ( int i=0; i< usersCount;i++) {
      if (users[i].getEmail().equals(email)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Метод возвращающий всех пользователей из хранилища
   * @return
   */
  public User[] findeAll () {
    // Важно вернуть не исходный массив, а его копию.
    User[] copy = new User[usersCount]; // Размер соотв кол-ву пользователей
    for (int i = 0; i < usersCount; i++) {
      copy[i] = users[i]; // Копируем всех в новый массив
    }
    return copy;
  }

  public User[] getUsers() {
    return users;
  }
}
