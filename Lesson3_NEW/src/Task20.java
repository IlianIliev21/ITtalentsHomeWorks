
public class Task20 {
	public static void main(String[] args) {
		
		// �� �� ������� ��������, ���� ����� �� ������� ������� 
		// �� �����. ������ �� ���������� �� ���������� ��� ���
		// ���� �� ����� �� 45.
		
		
		int y = 1;
		
		for (int i = 0; i <= 9; i++) {
			y--;
			if (y == -1) {
				y = 9;
			}
		for (int x = 0 ;x <= 9 ; x ++) {
			y--;
			if (y == -1) {
				y = 9;
			}
			System.out.print(y + " ");
		}
		System.out.println();
		}
	}
}
