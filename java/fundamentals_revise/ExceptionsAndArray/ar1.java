package ExceptionsAndArray;

import java.util.Random;

public class ar1 {
 public static void main(String[] args){
  int[] arr=new int[10];
  Random rand=new Random();
  for(int i=0;i<arr.length;i++){
    arr[i]=rand.nextInt(100)+1;
  }
  int[] arr2=new int[arr.length];
  System.arraycopy(arr, 0, arr2, 0, arr.length); 

  for(int i=0;i<arr2.length;i++){
    if(arr2[i]%2==0){
      arr2[i]=arr2[i]/2;
    } 
  }
  System.out.println("Orginal array:");
  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
  System.out.println("\n");
  System.out.println("Mofidied array:");
  for(int i=0;i<arr2.length;i++){
    System.out.print(arr2[i]+" ");
  } 
 }
}
/*
 OPTIMAL WAY

 package ExceptionsAndArray;

import java.util.Random;

public class Ar1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();

        // Fill original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        // Create copy and modify
        int[] arr2 = arr.clone();
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                arr2[i] /= 2;
            }
        }

        // Print arrays
        printArray("Original array:", arr);
        printArray("Modified array:", arr2);
    }

    private static void printArray(String label, int[] array) {
        System.out.println(label);
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println("\n");
    }
}

 */