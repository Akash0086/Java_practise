package practise;

import java.util.HashMap;

public class longSubArr {
  public static void main(String[] args){
    int[] arr={1, 2, 3, -3, 4};
    int n=arr.length;
    int k=3;

    HashMap<Integer,Integer> sumMap=new HashMap<>();
    sumMap.put(0,-1);

    int cumSum=0,maxLen=0,start=0,end=-1;

    for(int i=0;i<n;i++){
      cumSum += arr[i];

      if(sumMap.containsKey(cumSum-k)){
        int cumLen=i-sumMap.get(cumSum-k);
        if(cumLen > maxLen){
          maxLen=cumLen;
          start = sumMap.get(cumSum - k)+1; // Start after the previous sum
          end = i;

        }
      }
      if(!sumMap.containsKey(cumSum-k)){
        sumMap.put(cumSum,i);
      }
    }
    System.out.println(maxLen);

    for(int i=start;i<=end;i++){
      System.out.print(arr[i]+" ");
    }

  }
  
}
