package Lesson38.services;

import Lesson38.repositories.OrderRepository;
import Lesson38.repositories.ProductShopRepository;
import Lesson38.repositories.ProductUserRepository;

public class OrderService {
  //Сервис для формирования заказа.
  private ProductShopRepository productShopRepository;
  private ProductUserRepository productUserRepository;

  private OrderRepository orderRepository;


  public OrderService(ProductShopRepository productShopRepository,
      ProductUserRepository productUserRepository, OrderRepository orderRepository) {
    this.productShopRepository = productShopRepository;
    this.productUserRepository = productUserRepository;
    this.orderRepository = orderRepository;
  }

  public void completeOrder() {
    orderRepository.makeReport();

  }
}
