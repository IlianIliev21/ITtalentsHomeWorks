import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		
		//По зададено число n, да се изведе на екрана таблица по следния начин
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a N number");
		
		int n = sc.nextInt();
		int x = n-1;
		
		
		for (int a = 1;a<=n;a++) {
			for (int y = 1;y<=n;y++) {
			System.out.print(x);
		}
			System.out.println();
			x=x+2;
		}		
		sc.close();
	}
}
