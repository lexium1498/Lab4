package Lab4;
import java.util.Scanner; 

public class ex3 {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer n : ");
		int n = s.nextInt();
		int sum = 1; 
		int average; 
		for( int i = 0 ; i <= n ; i ++) {
			sum = sum + i ; 
			average = sum/n;
			System.out.println(average);
		}
	}
}
