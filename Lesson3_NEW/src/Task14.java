import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		
		/*
		 * ������ 14: �� �� ������� ��������, ����� �� �������� ���������� ����� N
		 * �� ��������� [10..200] ������� � ������� ��� ������ �����, ����� ��
		 * ������ �� 7 � �� ��-����� �� N.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Please enter a number between 10 and 200!");
			n = sc.nextInt();
		} while (n>200 || n<10);
		
		for (int i=n;i>=10;i--) {
			if (i%7==0) {
				System.out.print(i + ",");
			}
		}
		sc.close();
	}
}
