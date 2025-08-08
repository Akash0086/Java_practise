package practise.Strings;

public class ex2 {
  public static void main(String[] args){
    String s="Hello WOrlD";
    int countU=0,countL=0;
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(Character.isUpperCase(ch)){
        countU++;
      }
     else if (Character.isLowerCase(ch)) {
      countL++;
    }
  }
    
    System.out.println(countU);
    System.out.println(countL);
  }
}

