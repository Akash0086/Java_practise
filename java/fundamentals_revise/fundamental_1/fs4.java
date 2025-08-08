package fundamental_1;
/*Find the sum of the series: 1 + 1/2 + 1/3 + ... + 1/n using a while loop.
 Print the sum rounded to 4 decimal places.*/

import java.util.Scanner;

public class fs4 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number:");
      int n=sc.nextInt();
      double sum=0.0;int i=1;

      while(i<=n){
        sum += 1.0/i;
        i++;
      }
      System.out.printf("%.4f%n",sum);
      sc.close();
  }
}
