package Lesson38.repositories;

public class ProductUserRepository {

  private ProductShopRepository productShopRepository;

  private String[] items;
  private static final int MAX_PRODUCT_IN_BASKET = 15; // В корзине не более 15 продуктов
  // только розница
  private int productInUsersBasketCount;

  public ProductUserRepository(ProductShopRepository productShopRepository) {
    this.items = new String[MAX_PRODUCT_IN_BASKET];
    this.productShopRepository = productShopRepository;
  }

  public void addProductInBasket(String name, int amount) {
    String[] allNames = productShopRepository.getAllNames();
    if (amount > MAX_PRODUCT_IN_BASKET || (productInUsersBasketCount + amount) > MAX_PRODUCT_IN_BASKET)  {
      System.out.println("Количество товаров в корзине не может быть больше 15\n");
      return;
    }
    int fakeLength = productInUsersBasketCount;
    for(String a : allNames) {
      if (a.equals(name)) {
        for (int i = productInUsersBasketCount; i < amount+fakeLength; i++) {
          items[i] = name;
          this.productInUsersBasketCount++;
        }
        break;
      }
    }
    if (fakeLength != productInUsersBasketCount) {
      System.out.println("Товары успешно добавлены\n");
    }

  }


  public boolean isMoreThenMaxCount() {
    return productInUsersBasketCount > 15;
  }

  public void showAllProductsInBasket() {
    if (productInUsersBasketCount == 0) {
      System.out.println("В корзине ничего нет!\n");
      return;
    }
    for (int i = 0; i < productInUsersBasketCount; i++) {
      System.out.print(items[i] + ",");
    }
    System.out.println();
  }

  public String[] getItems() {
    return items;
  }
}
