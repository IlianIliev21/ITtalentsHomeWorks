import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {

		// Да се състави програма, чрез която по въведено естествено число
		// в интервала 1..99 се извежда поредица числа спазваща следните
		// изисквания:
		// 1. Ако предходното числото е четно се извежда 0.5*числото.
		// 2. Ако предходното число е нечетно се извежда 3*числото +1.
		// извеждането продължава докато не се получи стойност 1.

		Scanner sc = new Scanner(System.in);

		int a;

		do {
			System.out.println("Please enter a number![1..99]");
			a = sc.nextInt();
		} while (a < 1 || a > 99);
		int x = a;

		for (int j = a;; j--) {

			if (x == 1) {
				break;
			}

			else if (x % 2 == 0) {
				x = x / 2;
				System.out.print(x + " ");
			} else if (x % 2 != 0) {
				x = x * 3 + 1;
				System.out.print(x + " ");
			}

		}

		sc.close();
	}
}
