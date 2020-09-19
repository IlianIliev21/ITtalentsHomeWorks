import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {

		// �� �� ������� ��������, ���� ����� �� �������� ���������� �����
		// � ��������� 1..99 �� ������� �������� ����� �������� ��������
		// ����������:
		// 1. ��� ����������� ������� � ����� �� ������� 0.5*�������.
		// 2. ��� ����������� ����� � ������� �� ������� 3*������� +1.
		// ����������� ���������� ������ �� �� ������ �������� 1.

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
