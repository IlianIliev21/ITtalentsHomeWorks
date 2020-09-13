import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Please enter the current hour! [0-24]");
	
	int a = sc.nextInt();
	
	if (a<0 || a>24) {
		System.out.println("Please enter a hour between 0 and 24!");
		int b = sc.nextInt();
		
		if (b>3 && b<9) {
			System.out.println("Good Morning!");
		}
	
		else if ((b<25 && b>17) || (b>0 && b<4)) {
			System.out.println("Good evening!");
		}
		else if (b>8 && b<19) {
			System.out.println("Good afternoon!");
		}
	}
	

		else if (a>3 && a<9) {
			System.out.println("Good Morning!");
		}
	
		else if ((a<25 && a>17) || (a>0 && a<4)) {
			System.out.println("Good evening!");
		}
		else if (a>8 && a<19) {
			System.out.println("Good afternoon!");
		}
	sc.close();
	}
}
