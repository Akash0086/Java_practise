package practise.Array;

import java.util.*;

public class freq {
  public static int freEle(int[] arr,int n){
    Arrays.sort(arr);
      int current_fre=1,max_freq=1,maxEle=arr[0];
      for(int i=0;i<arr.length-1;i++){
        if(arr[i+1]==arr[i]){
          current_fre++;
        }else current_fre=1;

        if(current_fre>max_freq){
          max_freq=current_fre;
          maxEle=arr[i];
        }
      }
      return maxEle;

  }

  public static void main(String[] args) {
    int[] arr={1,2,3,1,2,1,4,1,5,5,5};
    int n=arr.length;
    System.out.println("Maximum frequency element is "+freEle(arr,n));
      
  }
  
}

//Using hash method

