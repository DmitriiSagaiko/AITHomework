package Lesson38.repositories;

import Lesson38.models.User;

public class OrderRepository {

  private UsersRepository usersRepository;

  private ProductUserRepository productUserRepository;

  private ProductShopRepository productShopRepository;


  public OrderRepository(UsersRepository usersRepository,
      ProductUserRepository productUserRepository, ProductShopRepository productShopRepository) {
    this.usersRepository = usersRepository;
    this.productUserRepository = productUserRepository;
    this.productShopRepository = productShopRepository;
  }

  public void makeReport() {
    User[] users = usersRepository.getUsers();
    if (users[0] == null) {
      System.out.println("Создайте нового пользователя и повторите ввод формирования запроса\n");
      return;
    }
    User user = users[0];

    System.out.println(
        user.getFirstName() + " " + user.getLastName() + " почта: " + user.getEmail() + " " +
            " Заказал ");
    productUserRepository.showAllProductsInBasket();

    System.out.println("Итоговая цена: " + getTotalPrice());
  }

  public double getTotalPrice() {
    String[] items = productUserRepository.getItems();
    double[] prices = productShopRepository.getAllPrices();
    String[] allProducts = productShopRepository.getAllNames();

    double sum = 0;

    for (int i = 0; i < allProducts.length; i++) {
      for (int j = 0; j < items.length; j++) {
        if (items[j] == null) {
          continue;
        } else {
          if (items[j].equals(allProducts[i])) {
            sum = sum + prices[i];
          }
        }
      }
    }

    return sum;
  }

}
