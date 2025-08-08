package ExceptionsAndArray;

import java.util.Scanner;

public class ex2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int[] arr={1,2,3,4,5,6};

      while(true){  

      int index=sc.nextInt();
      try{
        int value=arr[index];
        System.out.println("the value at"+ index+"position in array is "+value); 
        break;
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.print("Enter the valid index value ");
      }
    }
      
    sc.close();
  }
}
