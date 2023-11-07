package Lesson43;

import java.time.LocalDate;

public class Document {

  private State state;
  private String name;

  private LocalDate localDate;

  public Document(String name) {
    this.state = State.DRAFT;
    this.name = name;
    this.localDate = LocalDate.now();
  }


  public void publish() {
    if (state == State.DELETED) {
      System.err.println("Документ удален, его нельзя опубликовать.");
      return;
    } else if (state == State.PUBLISHED) {
      System.err.println("Документ уже опубликован. Его не нужно публиковать 2 раз");
      return;
    }
    this.setState(State.PUBLISHED);
  }

  public void delete() {
    if (state == State.DELETED) {
      System.err.println("Документ уже удален, его нельщя удалить второй раз");
      return;
    }
    this.setState(State.DELETED);
  }

  public void correct() {
    if (state == State.PUBLISHED) {
      this.setState(State.DRAFT);
      return;
    }
    System.err.println("Документ удален или неопубликован");
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }
}
