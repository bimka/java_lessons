package java_lessons;

class Queue {
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и извлечения 
                        // элементов очереди

    // Сконструировать очередь на основе имеющегося объекта
    Queue(Queue ob) {
      putloc = ob.putloc;
      getloc = ob.getloc;
      q = new char [ob.q.length];

      // Копировать элементы в очередь
      for (int i=getloc+1; i <= putloc; i++) 
        q[i] = ob.q[i];
    }


    // Сконструировать очередь на основе массива исходных данных
    Queue(char a[]) {
      putloc = 0;
      getloc = 0;
      q = new char[a.length+1]; // выделить память для очереди
      
      for (int i = 0; i < a.length; i++) put(a[i]);
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
class QDemo2 {
  public static void main (String args[]) {
    Queue q1 = new Queue();

    char name[] = {'T', 'o', 'm'};
    Queue q2 = new Queue(name);

    char ch;
    int i;

    // поместить буквенные символы в очередь q1
    for (i=0; i < 10; i++)
      q1.put((char) ('A' + i));

    // Создать одну очередь на основе другой
    Queue q3 = new Queue(q1);

    // Показать очереди
    System.out.print("Содержимое q1: ");
    for (i=0; i < 10; i++) {
      ch = q1.get();
      System.out.print(ch);
    }

    System.out.println("\n");

    System.out.print("Содержимое q2: ");
    for (i=0; i < 10; i++) {
      ch = q2.get();
      System.out.print(ch);
    }

    System.out.println("\n");

    System.out.print("Содержимое q3: ");
    for (i=0; i < 10; i++) {
      ch = q3.get();
      System.out.print(ch);
    }

    
  }
}