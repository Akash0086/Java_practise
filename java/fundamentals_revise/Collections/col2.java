package Collections;

import java.util.HashSet;
import java.util.Scanner;

public class col2 {
  public static void main(String[] args) {
      HashSet<Integer> hashSet=new HashSet<>();
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter integers separated by space:");

      String line=sc.nextLine();
      String[] tokens=line.trim().split("\\s+");

      for(String token:tokens){
        try {
            int num=Integer.parseInt(token);
            hashSet.add(num);
        } catch (NumberFormatException e) {
          System.out.println("Skipping invalid number: " + token);
        }
      }

      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      int sum=0;

      for(int num:hashSet){
        if(num>max){
          max=num;
        }
      }
      System.out.println("Max number is "+max);

      for(int num:hashSet){
        if(num<min){
          min=num;
        }
      }
      System.out.println("Min number is "+min);
      
      for(int num:hashSet){
        sum+=num;
      }
      System.out.println("Sum is "+sum);

      sc.close();
      
      
  }
  
}
