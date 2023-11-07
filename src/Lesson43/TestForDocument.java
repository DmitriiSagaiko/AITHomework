package Lesson43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestForDocument {

  private Document document;
  private Document document1;

  @BeforeEach
  void setUp() {
    document = new Document("Проект1");
    document1 = new Document("Проект2");
  }

  @Test
  void testCorrectPublish() {
    document.publish();
    Assertions.assertEquals(State.PUBLISHED, document.getState());
  }

  @Test
  void testCorrectDelete() {
    //Удалим документы из разных состояний
    document.delete();
    document1.publish();
    document1.delete();
    Assertions.assertEquals(State.DELETED, document.getState());
    Assertions.assertEquals(State.DELETED, document1.getState());
  }

  @Test
  void testValidCorrect() {
    document.publish();
    document.correct();
    Assertions.assertEquals(State.DRAFT, document.getState());
  }

  /////////////////// Запускаем невалидные тесты
  @Test
  void testIncorrectPublish() {
    document.publish();
    document.publish();
    document1.delete();
    Assertions.assertEquals(State.PUBLISHED, document.getState());
    Assertions.assertNotEquals(State.PUBLISHED, document1.getState());
  }

  @Test
  void testIncorrectDelete() {
    document1.delete();
    document1.delete();
    Assertions.assertNotEquals(State.PUBLISHED, document1.getState());
    Assertions.assertNotEquals(State.DRAFT, document1.getState());
  }

  @Test
  void testInvalidCorrect() {
    document.correct();
    Assertions.assertNotEquals(State.PUBLISHED, document.getState());
    Assertions.assertNotEquals(State.DELETED, document.getState());
    document1.delete();
    document1.correct();
    Assertions.assertNotEquals(State.PUBLISHED, document1.getState());
    Assertions.assertNotEquals(State.DRAFT, document1.getState());
  }

}
