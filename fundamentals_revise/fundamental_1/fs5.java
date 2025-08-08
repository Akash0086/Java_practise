package fundamental_1;
import java.util.Scanner;

public class fs5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the month");
    int month=sc.nextInt();
    System.out.println("Enter the year");
    int year=sc.nextInt();

    switch(month){
      case 1,3,5,7,8,10,12 -> System.out.println("31");
      case 4,6,9,11 -> System.out.println("30");
      case 2 -> {
          if((year%4==0 && year%100 != 0)||year%400 == 0){
              System.out.println(29);
          }
          else{
              System.out.println("28");
          }
        }
      
      default -> {
        System.out.println("Enter valid input");
       }

  }
  sc.close();
  
}

}
