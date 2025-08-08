package practise.Array;

import java.util.*;

public class twoSum {

  public int[] sol(int[] arr,int target){
    
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
      
          if(arr[i]+arr[j]==target){
            return new int[] {i,j};
          }
        }
          
        }
      
      return new int[] {};
    }
    
  
  public static void main(String[] args){
    int[] arr={1,2,1,3,4};
    int target=3;
    

    twoSum solution=new twoSum();
    int[] result=solution.sol(arr,target);
    System.out.println(Arrays.toString(result));

    
  }
}
