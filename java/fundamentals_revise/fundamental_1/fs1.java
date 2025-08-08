package fundamental_1;
import java.util.Scanner;

public class fs1 {
  
  @SuppressWarnings("ConvertToTryWithResources")
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string containing numbers:"); 
    String str=sc.nextLine();
    int sum=0;
    String num="";
    
    for(char ch:str.toCharArray()){
      if(Character.isDigit((ch))){
        num += ch;
      }else{
        if(!num.isEmpty()){
          for(char digit : num.toCharArray()){
            sum+= Character.getNumericValue(digit);
          }
          num="";
        }
      }
      
    }
    if (!num.isEmpty()) {
            for (char digit : num.toCharArray()) {
                sum += Character.getNumericValue(digit);
            }
        }

    System.out.println(sum);
    
    sc.close();
  }
}
