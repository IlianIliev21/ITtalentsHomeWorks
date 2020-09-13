import java.util.Scanner;

public class task11 {
	public static void main(String[] args) {
		
		System.out.println("Please enter a number from 111 to 999 (without 0)");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a%10==0 || (a/10)%10==0 ) {System.out.println("Enter a number without 0 inside");
		int temp = sc.nextInt();
		a=temp;
		int b = temp/100;
		int c = temp/10;
		int d = temp%10;
		
			if (a%c==0 && a%d==0 && a%b==0) {System.out.println("You can divide the number by each of its digits!");
		
		}
			else {System.out.println("You can't divide the number by each of its digits! ");}
		}
		
		else if (a%10>0 && (a/10)%10>0) {
		
			int b = a/100;
			int c = a/10;
			int d = a%10;
		
			if (a%c==0 && a%d==0 && a%b==0) {System.out.println("You can divide the number by each of its digits!");
		
		}
			else {System.out.println("You can't divide the number by each of its digits! ");}
		}
		sc.close();
	}
}
