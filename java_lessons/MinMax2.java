package java_lessons;

//  применение инициализатора массива

class MinMax2 {
    public static void main (String args[]) {
      int nums[] = {100, -16, 32, 0, 78, -3,  16, 10, 93, 47};
      int min, max;
      
      min = max = nums[0];
      
      for (int i = 0; i < 10; i++) {
        if (nums[i] > max) max = nums[i];
        if (nums[i] < min) min = nums[i];
      }
      System.out.println("min, max: " + min + " " + max);
    }
  }
