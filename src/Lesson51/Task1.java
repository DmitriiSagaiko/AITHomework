package Lesson51;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {

  /*
  Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:

less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше
   */

  public static void main(String[] args) {

    File path = new File("src/Lesson51");
    File file = new File(path, "data");
    File less = new File(path, "less.txt");
    File more = new File(path, "more.txt");

    createFiles(fillTheMap(file), less, more);

  }

  public static Map<String, Integer> fillTheMap(File inputFile) {
    Map<String, Integer> output = new HashMap<>();

    try (FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        int intValue = parseInt(line);
        String key = parseString(line);
        output.merge(key, intValue, (oldValue, value) -> oldValue + value);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return output;
  }

  public static String parseString(String input) {
    String[] strings = input.split(":");
    return strings[0];
  }

  public static int parseInt(String input) {
    String[] strings = input.split(":");
    return Integer.parseInt(strings[1]);
  }

  public static void createFiles(Map<String, Integer> inputMap, File less, File more) {
    Set<Map.Entry<String, Integer>> entrySet = inputMap.entrySet();
    for (Map.Entry<String, Integer> entry : entrySet) {
      int value = entry.getValue();
      if (value < 2000) {
        String line = entry.getKey() + ":" + value;

        try (FileWriter fileWriter = new FileWriter(less, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
          bufferedWriter.write(line);
          bufferedWriter.newLine();
        } catch (IOException e) {
          e.printStackTrace();
        }


      } else {
        String line = entry.getKey() + ":" + value;

        try (FileWriter fileWriter = new FileWriter(more, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
          bufferedWriter.write(line);
          bufferedWriter.newLine();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }

}
