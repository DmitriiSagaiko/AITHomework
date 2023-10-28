package Lesson38.repositories;

import Lesson38.models.Product;

public class ProductShopRepository {

  private Product[] products;
  private static final int MAX_PRODUCT_IN_SHOP_COUNT = 100; // В магазине не более 100 продуктов
  // только розница
  private int productInShopCount;

  public ProductShopRepository() {
    this.products = new Product[MAX_PRODUCT_IN_SHOP_COUNT];
  }


  public void addProductInShop(Product product) {
    this.products[productInShopCount] = product;
    this.productInShopCount++;
  }

  public Product[] getAllProductsInShop() {
    Product[] copy = new Product[productInShopCount]; //
    for (int i = 0; i < productInShopCount; i++) {
      copy[i] = products[i]; // Копируем всех в новый массив
    }
    return copy;
  }


  public void showAllAvaliableProductsInShop() {
    for (int i = 0; i < productInShopCount; i++) {
      System.out.println(
          " В магазине есть: " + products[i].getTitle() + " " + products[i].getDescription()
              + " Это стоит "
              + products[i].getPrice() + " Рублей");
    }
  }

  public String[] getAllNames() {
    String[] output = new String[productInShopCount];
    for (int i = 0; i < productInShopCount; i++) {
      output[i] = products[i].getTitle();
    }
    return output;
  }

  public double[] getAllPrices() {
    double[] output = new double[productInShopCount];
    for (int i = 0; i < productInShopCount; i++) {
      output[i] = products[i].getPrice();
    }
    return output;
  }
}


