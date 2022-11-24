package java_lessons;

public class Queue {
    char q[]; // массив для хранения элементов очереди
    int putloc, getloc; // индексы для вставки и извлечения 
                        // элементов очереди

    Queue(int size) {
      q = new char[size+1]; // выделить память для очереди
      putloc = getloc = 0;
    }

    // поместить символ в очередь
    void put(char ch) {
      if (putloc==q.length-1) {
        System.out.println(" - Очередь заполнена");
        return;
      }

      putloc++;
      q[putloc] = ch;
    }

    // извлечь символ из очереди
    char get() {
      if (getloc == putloc) {
        System.out.println(" - Очередь пуста");
        return (char) 0;
      }

      getloc++;
      return q[getloc];
    }
}

// демонстрация использования класса Queue
class QDemo {
  public static void main (String args[]) {
    Queue bigQ = new Queue(100);
    Queue smallQ = new Queue(4);
    char ch;
    int i;

    System.out.println("Использование очерди bigQ для сохранения алфавита");
    // поместить буквенные символы в очередь bigQ
    for (i=0; i < 26; i++)
      bigQ.put((char) ('A' + i));

    // Извлечь буквенные символы из очереди bigQ и отобразить
    System.out.print("Содержимое очереди bigQ: ");
    for (i=0; i < 26; i++) {
      ch = bigQ.get();
      if (ch != (char) 0) System.out.print(ch);
    }

    System.out.println("\n");

    System.out.println("Использование очереди smallQ для генерации ошибок");
    // Использовать очередь smallQ для генерации ошибок
    for (i=0; i < 5; i++) {
      System.out.print("Попытка сохранения " + (char) ('Z' - 1));
      smallQ.put ((char) ('Z' - 1));

      System.out.println();
    }
    System.out.println();

    // Дополнительные ошибки при обращении к очереди smallQ
    System.out.print("Содержимое smallQ: ");
    for (i=0; i < i; i++) {
      ch = smallQ.get();
      if (ch != (char) 0) System.out.print(ch);
    }
  }
}