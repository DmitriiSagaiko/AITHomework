package Lesson38.services;

import Lesson38.repositories.ProductShopRepository;
import Lesson38.repositories.ProductUserRepository;

public class ProductService {
  // Сервис для работы с продуктами
  private final ProductShopRepository productShopRepository;
  private final ProductUserRepository productUserRepository;

  public ProductService(ProductShopRepository productShopRepository, ProductUserRepository productUserRepository) {
    this.productShopRepository = productShopRepository;
    this.productUserRepository = productUserRepository;
  }
  
  public void addProductInBasket(String name, int amount) { // Добавить в корзину покупателя.
    if (productUserRepository.isMoreThenMaxCount()) {
      System.out.println("Не могу положить товар в корзину, число товаров в корзине больше 15");
      return;
    }
    productUserRepository.addProductInBasket(name, amount);
  }


  public void showAllProductsInBasket() {
    productUserRepository.showAllProductsInBasket();
  }


  public void showProductsInShop() {
    productShopRepository.showAllAvaliableProductsInShop();
  }
  
}
