package Lesson38.services;

import Lesson38.models.User;
import Lesson38.repositories.UsersRepository;

public class UsersService {
// Сервис для работы с пользователем
  private final UsersRepository usersRepository;

  public UsersService(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  public void register(String firstName, String lastName, String email, String password) {
    // проверим нет ли пользователя с таким email
    if (usersRepository.isExistsByEmail(email)) {
      System.err.println("Пользователь с таким email уже есть");
      return;
    }
    // создаем пользователя
    User user = new User(firstName,lastName,email,password);
    usersRepository.save(user);
  }

  public User[] getAllUsers() {
    return usersRepository.findeAll();
  }



}
