package pattern_printing;

public class p1 {
  public static void main(String[] args){
    int n=5;
    for(int i=0;i<n;i++){
      for(int j=0;j<i;j++){
        System.out.print("* ");
      }
      System.out.println("\n");
    }
    for(int i=n-2;i>0;i--){
      for(int j=i;j>0;j--){
        System.out.print("* ");
      }
      System.out.println("\n");
    }
  }
  
}
