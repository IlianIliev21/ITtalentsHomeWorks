import java.util.Scanner;

public class task17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number!");
		
		int x = sc.nextInt();
		
		if (x%2==0) {System.out.println("The number is an even!");
		}
		
		else {System.out.println("An odd number");}
		
		sc.close();
	}
}
