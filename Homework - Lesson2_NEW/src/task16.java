import java.util.Scanner;
public class task16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number [100..999]");
		
		int a = sc.nextInt();
		
		int d = a%10;
		int c = (a/10)%10;
		int b = a/100;
			
	if (b==d && c==d && d==b ) {
		System.out.println("The numbers are equal");
	}
	
	else if (b>c && c>d) {
		System.out.println("The numbers are in descending order!");
	}
	else if (d>c && c>b) {
		System.out.println("The numbers are in ascending order!");
	}
	else {
		System.out.println("The numbers are unordered");
	}
	}
}
