package fundamental_1;
import java.util.Scanner;

public class fs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        String value1 = sc.nextLine();

        System.out.print("Enter second value: ");
        String value2 = sc.nextLine();

        System.out.print("Enter operator (+, -, *, /): ");
        String opStr = sc.nextLine();
        char operator = opStr.charAt(0);

        double a = Double.parseDouble(value1);
        double b = Double.parseDouble(value2);
        
        double result=0;

        switch(operator){
          case '+':
          result=a+b;break;

          case '-':
          result=a-b;break;
          case '*':
          result=a*b;break;
          case '/':
          result=a/b;break;
          default:
              System.out.println("Invalid operator.");
              sc.close();
              return;
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}