package Lesson38.view;

import Lesson38.models.Product;
import Lesson38.models.User;
import Lesson38.services.OrderService;
import Lesson38.services.ProductService;
import Lesson38.services.UsersService;
import java.util.Scanner;

public class Menu {

  private UsersService usersService;
  private ProductService productService;

  private OrderService orderService;
  private User[] users;

  private Product[] products;

  public Menu(UsersService usersService, ProductService productService, OrderService orderService) {
    this.usersService = usersService;
    this.productService = productService;
    this.orderService = orderService;
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("1. Зарегистрировать пользователя");
      System.out.println("2. Показать всех пользователей");
      System.out.println("3. Показать доступные товары в магазине");
      System.out.println("4. Показать все товары в моей корзине");
      System.out.println("5. Добавить товар в корзину");
      System.out.println("6. Оформление заказа");
      System.out.println("0. Выход из программмы");
      int command = scanner.nextInt();
      scanner.nextLine();

      switch (command) {
        case 0: {
          System.out.println("Выход из программы");
          System.exit(0);
        }
        break;
        case 1: {
          System.out.println("Введите Имя");
          String firstName = scanner.nextLine();
          System.out.println("Введите фамилию");
          String lastName = scanner.nextLine();
          System.out.println("Введите емейл");
          String email = scanner.nextLine();
          System.out.println("Введите пароль");
          String password = scanner.nextLine();

          usersService.register(firstName, lastName, email, password);
        }
        break;
        case 2: {
          User[] users = usersService.getAllUsers();
          for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getFirstName() + " || " + users[i].getLastName());
          }
        }
        break;
        case 3: {
          productService.showProductsInShop();
          System.out.println();
        }
        break;
        case 4: {
          productService.showAllProductsInBasket();
        } break;
        case 5: {
          System.out.println("Напиши название товара(товары есть в п3)");
          String ProductName = scanner.nextLine();
          System.out.println("Напиши количество покупаемого товара");
          int ProductAmount = scanner.nextInt();
          productService.addProductInBasket(ProductName,ProductAmount);
        } break;
        case 6: {
          orderService.completeOrder();
        } break;
      }
    }
  }
}
