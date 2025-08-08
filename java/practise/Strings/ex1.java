package practise.Strings;
// public class ex1 {
//   public static void main(String[] args) {
//     String s="Hello12World";
//     boolean stringContain=true;
//     for(int i=0;i<s.length();i++){
//       if(Character.isDigit(s.charAt(i))){
//         stringContain=false;
//         break;
//       }
//     }
//     if(stringContain){
//       System.out.println("It is zstring");
//     }else 
//     System.out.println("It is not a String");
      
//   }
  
// }

//-------------------------------------------------------------------
public class ex1 {
     public static void main(String[] args) {
      String s="Hello World";
      if(s.matches("[a-zA-Z ]+")){
        System.out.println("It is a String");
      }else{
      System.out.println("It is not a String");
      }
    }
  }