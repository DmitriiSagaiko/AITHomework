package Lesson38.view;

import Lesson38.models.Product;
import Lesson38.repositories.OrderRepository;
import Lesson38.repositories.ProductShopRepository;
import Lesson38.repositories.ProductUserRepository;
import Lesson38.repositories.UsersRepository;
import Lesson38.services.OrderService;
import Lesson38.services.ProductService;
import Lesson38.services.UsersService;

public class Main {

  public static void main(String[] args) {
    UsersRepository usersRepository = new UsersRepository();
    UsersService usersService = new UsersService(usersRepository);

    ProductShopRepository productShopRepository = new ProductShopRepository();
    ProductUserRepository productUserRepository = new ProductUserRepository(productShopRepository);
    OrderRepository orderRepository = new OrderRepository(usersRepository,productUserRepository,productShopRepository);

    ProductService productService = new ProductService(productShopRepository,productUserRepository);
    OrderService orderService = new OrderService(productShopRepository,productUserRepository,orderRepository);
    //Создадим пару продуктов в интернет магазине и добавим их в каталог магазина
    Product product1 = new Product("Носки", 150, " Рождественские носки");
    Product product2 = new Product("Свечка", 250, " Рождественская восковая свечка");
    Product product3 = new Product("Велосипед", 25000,
        " Хороший велосипед. Отлично подходит для перемещения по городу");

    productShopRepository.addProductInShop(product1);
    productShopRepository.addProductInShop(product2);
    productShopRepository.addProductInShop(product3);


    Menu menu = new Menu(usersService, productService,orderService);
    menu.run();
  }
}
