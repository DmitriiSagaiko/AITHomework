package Lesson28;

public class Dictionary {

  public static class DictionaryPair {

    private String russianWord;
    private final String englishWord;

    public DictionaryPair(String russianWord, String englishWord) {
      this.russianWord = russianWord;
      this.englishWord = englishWord;
    }

    @Override
    public String toString() {
      return russianWord + " - " + englishWord;
    }
  } // вложенный класс

  public class Translator {

    public String[] translate(String[] words) {
      String[] output = new String[words.length];
      for (int i = 0; i < words.length; i++) {
        DictionaryPair current = dictionaryPairs[i];
        if (count > i) {
          if (current.russianWord.equals(words[i])) {
            output[i] = current.englishWord;
          }
        } else {
          output[i] = words[i];
        }
      }
      return output;
    }
  } // внутренний класс

  private final DictionaryPair[] dictionaryPairs;

  private int count;

  public Dictionary() {
    this.dictionaryPairs = new DictionaryPair[10];
    this.count = 0;
  } // конструтор

  public void put(String inputRussianWord, String inputEnglishWord) {
    for (int i = 0; i < count; i++) {
      DictionaryPair current = dictionaryPairs[i];
      if (current.englishWord.equals(inputEnglishWord)) {
        current.russianWord = inputRussianWord;
        return;
      }
    }
    DictionaryPair newPair = new DictionaryPair(inputRussianWord, inputEnglishWord);
    dictionaryPairs[count] = newPair;
    count++;
  }

  public String get(String inputRussianWord) {
    for (int i = 0; i < count; i++) {
      DictionaryPair current = dictionaryPairs[i];
      if (current.russianWord.equals(inputRussianWord)) {
        return current.englishWord;
      }
    }
    return inputRussianWord;
  }

}
