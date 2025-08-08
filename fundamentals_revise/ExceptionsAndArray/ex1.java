package ExceptionsAndArray;

import java.util.Scanner;
public class ex1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the two numbers :");
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    int result=0;
    int[] arr=new int[3];

     boolean divisionSuccess = false;
     boolean storageSuccess = false;
    try {
      result=a/b;
      System.out.println("Result is "+result);
      divisionSuccess=true;
        
    }
    catch (ArithmeticException  e) {
      System.out.println("Enter a valid divisor");
    }
    try {
       int index=sc.nextInt();
       arr[index]=result; 
       System.out.println("Stores result in array["+index+"] successfully");
       storageSuccess=true;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index! Operation failed.");
    
    System.out.println("\n=== Operation Status ===");
    System.out.println("Division: " + (divisionSuccess ? "Succeeded" : "Failed"));
    System.out.println("Storage: " + (storageSuccess ? "Succeeded" : "Failed"));
    sc.close();
  } 
}
}
