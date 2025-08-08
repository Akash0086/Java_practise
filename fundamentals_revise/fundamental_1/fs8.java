package fundamental_1;

import java.util.Scanner;

public class fs8{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String string=sc.nextLine().toLowerCase();
    
    StringBuilder palin=new StringBuilder();

    for(char ch:string.toCharArray()){
      if(Character.isLetter(ch)){
        palin.append(ch);
      }
    }
    String cleaned=palin.toString();
    String reversed=palin.reverse().toString();

    if(reversed.equals(cleaned)){
      System.out.println("It is palindrome");
    }else{
      System.out.println("It is not a palindrome");
    }
    sc.close();    
    

    }
  
}
