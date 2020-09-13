import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		
		
		// Задача 9: Да се прочетат 2 числа от клавиатурата А и В. Да се изведат
		// всички числа от А до В на степен 2(разделени с запетая).Ако някое число е
		// кратно на 3, да се изведе съобщение че числото се пропуска „skip 3“.Ако
		//сумата от всички изведени числа (без пропуснатите) стане по-голяма от
		// 200, да се прекрати извеждането.
	
		
		 
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
