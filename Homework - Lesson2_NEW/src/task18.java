import java.util.Scanner;

public class task18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 and 7!");
		
		int x = sc.nextInt();
		
		if (x<1 || x>7) {
			System.out.println("Invalid number! Please try again with number between 1 and 7");
			int b = sc.nextInt();
			if (b==1) {
				System.out.println("It's Mondey!");
			}
			else if (b==2) {
				System.out.println("It's Tuesday!");
			}
			else if (b==3) {
				System.out.println("It's Wednesday!");
			}
			else if (b==4) {
				System.out.println("It's Thrusday!");
			}
			else if (b==5) {
				System.out.println("It's Friday!");
			}
			else if (b==6) {
				System.out.println("It's Saturday!");
			}
			else if (b==7) {
				System.out.println("It's Sunday");
			}
			
		}
		
		else if (x==1) {
			System.out.println("It's Mondey!");
		}
		else if (x==2) {
			System.out.println("It's Tuesday!");
		}
		else if (x==3) {
			System.out.println("It's Wednesday!");
		}
		else if (x==4) {
			System.out.println("It's Thrusday!");
		}
		else if (x==5) {
			System.out.println("It's Friday!");
		}
		else if (x==6) {
			System.out.println("It's Saturday!");
		}
		else if (x==7) {
			System.out.println("It's Sunday");
		}
		sc.close();
	}
}
