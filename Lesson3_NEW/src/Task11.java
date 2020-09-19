import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a number for the rows of the pyramid!");
		int rows = sc.nextInt();
		int stars = 1;

		for (int row = 1; row <= rows; row++) {

			for (int spaces = 1; spaces <= rows - row; spaces++) {
				System.out.print(" ");
			}
			for (int x = 1; x <= stars; x++) {
				if(x == 1 || x == stars || row == rows) {
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			System.out.println();
			stars = stars + 2;

		}

	}
}
