import java.util.Scanner;

public class task9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number! (10-99)");
			int a = sc.nextInt();
		System.out.println("Please enter a second number! (10-99)");
			int b = sc.nextInt();
			
			int x = a*b;
			
		if (x%2==0) {
			System.out.println(x + " , " + x%10 + " " + " The last figure is an even number!");
			}
		else if (x%2>0) {
			System.out.println(x + " , " + x%10 + " " + " The last figure is an odd number!");
		}
		
		sc.close();
		
	}

}
