package fundamental_1;
/*Generate the following pattern using for loop:
1
22
333
4444
55555
Instead of printing, store it in a list and return from a method.*/
import java.util.ArrayList;
import java.util.List;

public class fs3 {
  public static List<String> generatePattern(){
    List<String> pattern=new ArrayList<>();
      for(int i=0;i<6;i++){
        StringBuilder str=new StringBuilder();
        for(int j=1;j<=i;j++){
          str.append(i);
        }
        pattern.add(str.toString());
      }
      return pattern;
    }
    
  
  public static void main(String[] args) {
     List<String> result=generatePattern();
     for(String row:result){
      System.out.println(row);
     }
  }
}
