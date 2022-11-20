package java_lessons;

class Gues4 {
  public static void main(String args[])
  throws java.io.IOException {   
    char ch, ignore, answer = 'S';
        
    do {
      System.out.println("Задумана буква от A до Z");
      System.out.print("Попытайтесь её угадать:");
          
      ch = (char) System.in.read();
          
      do {
        ignore = (char) System.in.read();
      } while (ignore != '\n');
          
      if (ch == answer) System.out.println("***Правильно***");
      else {
        System.out.print("***Неправильно, ответ находится ближе к ");
        if (ch > answer) 
          System.out.println("началу алфавита***");
        else 
          System.out.println("концу алфавита");
        System.out.println("Повторите попытку");
        } } while (answer != ch);
      }
}

