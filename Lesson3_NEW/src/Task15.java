import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		int sum;
		int j;
		
		do {
			System.out.println("Enter a number from 1 to N");
			n = sc.nextInt();
		} while (n<1);
		
		do {
			int x = 1;
			int i = 1;
		    x = x+1;
			i++;
			sum=x;
			j=i;
		} while (j<=n);
		
		System.out.println(sum);
	}
}
