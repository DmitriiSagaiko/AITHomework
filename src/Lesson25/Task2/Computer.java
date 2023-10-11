package Lesson25.Task2;

public class Computer {

  private Memory memory;
  private Processor processor;
  private Storage storage;

  public Computer() {
    this.memory = new Memory("Kingston", "Fury", 8096, 4.8);
    this.processor = new Processor("Intel", "core I5", 3.5, 15);
    this.storage = new Storage("Western Digital", "blue", 2);
  }

  public String toString() {
    return "{ У компьютера есть ОЗУ " + memory + " Процессор " + processor + " жесткий диск "
        + storage;
  }
}
