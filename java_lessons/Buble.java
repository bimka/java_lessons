package java_lessons;

//Демонстрация алгоритма пузырьковой сортировки

class Buble {
    public static void main (String args[]) {
      int nums[] = {100, -20, 23, 64, 76,
                    -34, 45, 1, 99, 78};
      int a, b, t;
      int size;
      
      size = 10; // Количество сортируемых элементов
      
      // Отобразить исходный массив
      System.out.print("Исходный массив:");
      for (int i = 0; i < size; i++) {
        System.out.print(" " + nums[i]);
      }
      System.out.println();
      
      // Реализовать алгоритм пузырьковой сортировки
      for (a = 1; a < size; a++) {
        for (b = size - 1; b >= a; b--) {
          if (nums[b-1] > nums[b]) {
            t = nums[b-1];
            nums[b-1] = nums[b];
            nums[b] = t;
          }
        }
      }
        // Отобразить отсортированный список
        System.out.print("Отсортированный список:");
        for (int i=0; i<size; i++) {
          System.out.print(" " + nums[i]);
        }
      
    }
  }
