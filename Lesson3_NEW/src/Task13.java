import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum;

		do {
			System.out.println("Enter a sum between 2 and 27");
			sum = sc.nextInt();
		} while (sum > 27 || sum < 2);

		for (int i = 100; i <= 999; i++) {
			int a = i % 10;
			int b = (i / 10) % 10;
			int c = i / 100;

			if (a + b + c == sum) {
				System.out.print(i + ",");
			}

		}

	}
}

