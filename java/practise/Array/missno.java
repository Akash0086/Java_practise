package practise.Array;
import java.util.*;

public class missno {
  public static List<Integer> findMissingElement(int arr[],int n){
    Arrays.sort(arr);
    int min=arr[0];
    int max=arr[arr.length-1];
    List<Integer> missingNumbers=new ArrayList<>();
    for(int i=min;i<=max;i++){
      boolean found=false;
      for(int num : arr){
        if(num==i){
        found = true;
        break;
        }
      }
      if(!found){
        missingNumbers.add(i);
      }
    }
    return missingNumbers;
  }
  
    public static void main(String[] args) {
      int[] arr={20,22,23,24,26,28,30};
      int n=arr.length;
      System.out.println("Missing Numbers is "+findMissingElement(arr,n));
      
  }
 
  
}
