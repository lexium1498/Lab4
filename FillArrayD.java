package Lab4;
import java.util.Scanner;

public class FillArrayD {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int n = s.nextInt();
		
		int [] a = new int[n];
		
		for(int i = 0 ; i < n ; i = i + 2) {
			a[i] = 0; 
		}
		
		for(int i = 0 ; i < n ; i = i + 1) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
