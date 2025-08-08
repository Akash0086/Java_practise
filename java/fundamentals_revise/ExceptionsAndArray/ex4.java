package ExceptionsAndArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] numbers=new int[100];
    int count=0;
    
    try {
        File file=new File("numbers.txt");
        Scanner readFile=new Scanner(file);

        while(readFile.hasNext()){
          String token=readFile.next();
          try {
              numbers[count]=Integer.parseInt(token);
              count++;
          } catch (NumberFormatException e) {
             System.out.println("Skipping invalid number: " + token);
          }
        }
        readFile.close();
    } catch (FileNotFoundException e) {
      System.out.println("Error: File not found.");
      return;
    }
    System.out.print("Enter a divisor: ");
    int divisor = sc.nextInt();
     
    for (int i = 0; i < count; i++) {
      try {
        System.out.println(numbers[i] + " / " + divisor + " = " + (numbers[i] / divisor));
      } catch (ArithmeticException e) {
        System.out.println("Error: Cannot divide by zero.");
        }
      }
    sc.close();
  }
}
