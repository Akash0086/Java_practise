//Two-Dimensional Array – Matrix Multiplication
package ExceptionsAndArray;

import java.util.Scanner;

public class ar3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int rowsA=2,colsA=3;
    int rowsB=3,colsB=2;

    int[][] A=new int[rowsA][colsA];
    int[][] B=new int[rowsB][colsB];
    int[][] C=new int[rowsA][colsB];

    for(int i=0;i<rowsA;i++){
      for(int j=0;j<colsA;j++){
        System.out.print("A["+i+"]["+j+"] = ");
        A[i][j]=sc.nextInt();
      }
    }

    for(int i=0;i<rowsB;i++){
      for(int j=0;j<colsB;j++){
        System.out.print("B["+i+"]["+j+"] = ");
        B[i][j]=sc.nextInt();
      }
    }

    for(int i=0;i<rowsA;i++){
      for(int j=0;j<colsB;j++){
        C[i][j]=0;
        for(int k=0;k<colsA;k++){
          C[i][j] +=A[i][k] + B[k][j];
        }
      }
    }

    System.out.println("Result Matrix C (2x2):");
    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < colsB; j++) {
        System.out.print(C[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}
