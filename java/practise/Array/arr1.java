package practise.Array;

import java.util.Arrays;

//Move zero to end
public class arr1 {
  public static void main(String[] args){
    int[] arr={0,1,0,2,0,3};
    int n=arr.length;
    int index=0;
    for(int i=0;i<n;i++){
      if(arr[i]!=0){
        arr[index++]=arr[i];
      }
    }
    while(index<n){
      arr[index++]=0;
    }
    System.out.println(Arrays.toString(arr));
  }
  
}
