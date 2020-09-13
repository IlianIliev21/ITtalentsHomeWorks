import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	System.out.println("Please enter a number!");
		double a = sc.nextDouble ();
	System.out.println("Please enter the second number!");
		double b = sc.nextDouble ();
	System.out.println("Please enter third number!");
		double c = sc.nextDouble ();
		
	if (c>a && c<b || c<a && c>b) {
		System.out.println("The third number is between the first and second number you wrote");
	}
	
		else {
			System.out.println("The number is not between them");}
	
	
	
	}

}
