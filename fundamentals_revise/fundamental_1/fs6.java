package fundamental_1;
import java.util.Scanner;

public class fs6 {
  public static double triangleArea(double a,double b,double c){
    if(a<=0||b<=0||c<=0){
      return -1.0;
    } if(a+b<c || b+c<a || a+c<b){
      return -1.0;
    }
    double s= (a + b + c) / 2.0;
    double area=Math.sqrt((s* (s - a) * (s - b) * (s - c)));

    return area;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextInt();
    double b=sc.nextInt();
    double c=sc.nextInt();
    double result=triangleArea(a, b, c);
    System.out.println(result);

    sc.close();
  }
  
}
