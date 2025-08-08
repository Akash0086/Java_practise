package practise;
import java.util.Scanner;

public class array {
	public void Main(String[] args) {
		Scanner size=new Scanner(System.in);
		int n=size.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		size.close();
	}

}
