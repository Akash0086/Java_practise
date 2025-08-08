//Top 3 Elements Average
package ExceptionsAndArray;

public class ar2 {
  public static void main(String[] args){   
    int[] arr={3,5,2,9,15,1};
    int first=Integer.MIN_VALUE;
    int second=Integer.MIN_VALUE;
    int third=Integer.MIN_VALUE;

    for(int num:arr){
      if(num>first){
        third=second;
        second=first;
        first=num;
      }else if(num>second && num!=first){
        third=second;
        second=num;
      }else if(num>third && num!=second){
        third=num;
      }
    }

    System.out.println("First "+first+" Second "+second+" third "+third);
  }  
}
