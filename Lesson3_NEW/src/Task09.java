import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		
		
		// ������ 9: �� �� �������� 2 ����� �� ������������ � � �. �� �� �������
		// ������ ����� �� � �� � �� ������ 2(��������� � �������).��� ����� ����� �
		// ������ �� 3, �� �� ������ ��������� �� ������� �� �������� �skip 3�.���
		//������ �� ������ �������� ����� (��� ������������) ����� ��-������ ��
		// 200, �� �� �������� �����������.
	
		
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the first number!");
			int a = sc.nextInt();
		System.out.println("Please enter the second number");
			int b = sc.nextInt ();
			int sum = 0;
			
			if (a>b) {
				int x = a;
				a = b;
				b = x;
			}
			
			for (int y = a;y<=b;y++) {
			
					
				if (y%3==0) {
					System.out.print("Skip 3" + ",");
					continue;
				}	
				else if (y<b) {
					System.out.print(y*y + ",");
				}
		
				
				sum=sum+(y*y);
				
				if (sum>=200) {
					break;
				}	
				
				}
			
		
		sc.close();
	}
}
