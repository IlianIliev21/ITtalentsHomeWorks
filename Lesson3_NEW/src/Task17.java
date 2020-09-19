import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		
		//Да се състави програма, която извежда квадрат, чийто страни
		//са оформени със знака *, а вътрешността е запълнена с въведен знак
		
		Scanner sc = new Scanner(System.in);
		
		int b;
		do {
		System.out.println("Please enter the number of the rows [ 3..20]!");
		b = sc.nextInt();
		
		} while (b < 3 || b > 20);
	
		
		System.out.println("Please enter a symbol");
		char c = sc.next().charAt(0);
	
		for (int j = 1; j <= b; j ++) {
		
			if (j == 1 || j == b) {
			for (int i = 1; i <= b;i ++) {
				System.out.print("*");
				}
			}	
			
			else if (j > 1 || j < b) {
			for (int y = 1; y <= 1; y ++) {
				System.out.print("*");
				for (int t = 2; t < b; t ++)
					System.out.print(c);
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
