import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		
		//�� �� ������� �� ����������� ��� ����� � �� �� ������� �� ������ ������ ����� 
		//�� ��-������� ��� ��-��������.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number!");
		
		int x = sc.nextInt();

		System.out.println("Please enter a second number and you'll see all the number between them");

		int y = sc.nextInt();

		if (x <= y) {
			for (; x <= y; ++x) {
				System.out.println(x);
			}
		} else if (y <= x) {
			for (; y <= x; ++y) {
				System.out.println(y);
			}
		}
		sc.close();

	}
}
