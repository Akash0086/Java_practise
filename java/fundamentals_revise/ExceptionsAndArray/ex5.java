//Bank System
package ExceptionsAndArray;
import java.util.Scanner;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
      super(message);
    }
  }
  class ExcessDepositException extends Exception{
    public ExcessDepositException(String message){
      super(message);
    }
  }
  class InvalidAccountException extends Exception{
    public InvalidAccountException(String message){
      super(message);
    }
  }
public class ex5 {

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the choice :");
    int choice=sc.nextInt();

    switch(choice){
      case 1:
    try {
      int balance=10000;
      System.out.print("Enter the amount to withdraw :");
      int amount=sc.nextInt();

      if(amount>balance){
        throw new InsufficientFundsException("unavailable balance in the account");
      }else {
        System.out.println("Successfully withdrew the amount. Available balance is: " + (balance - amount));
      }
    } catch (InsufficientFundsException e) {
      System.out.println(e.getMessage());
      }
      break;
      case 2:
    try{
     System.out.print("Enter the amount to deposit :");
     int deposit=sc.nextInt();
     
     if(deposit>100000){
      throw new ExcessDepositException("your deposit amount exceed the limit");
     }else{
      System.out.println("Successfully deposit the amount");
     }
    }catch(ExcessDepositException e){
      System.out.println(e.getMessage());
    }
    break;
    case 3:
    try {
      int accNo=1234;
      System.out.println("Enter the account number to transfer the amount :");
      int accN=sc.nextInt();
      if(accN!=accNo){
        throw new InvalidAccountException("Enter the correct Account number to transfer");
      }else{
        System.out.println("Successfully transfer the amount");
      }
    } catch (InvalidAccountException e) {
      System.out.println(e.getMessage());
    }
    break;
  }

  }
  
}
