import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {
		
		// Да се състави програма, чрез която се въвеждат две числа от интервал
		// [1...9]. Програмата да извежда таблица за умножение. Максималната
		// стойност на множителите е определена от двете числа.
		
		Scanner sc = new Scanner(System.in);

		int a;
		do {
			System.out.println("Please enter the first number! [1...9]");
			a = sc.nextInt();
		} while (a < 1 || a > 9);

		int b;
		do {
			System.out.println("Please enter the second number! [1...9]");
			b = sc.nextInt();
		} while (b < 1 || b > 9);
		
		if (a > b) {
			int x;
			x = b;
			b = a;
			a = x;
		}
			
		for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.println(i + "*" + j + "=" + (i*j) );
			}
		}
		sc.close();
	}
}
