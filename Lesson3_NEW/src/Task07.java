import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		
		//Започвайки от 3, да се извадят на екрана първите n числа, които се делят на 3.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter n number!");
		
		int n = sc.nextInt();
		int x = n-1;
	
		for (int a=1;a<=n;a++) {
			for (int y=1; y<=n; y++) {
			System.out.print(x);
			}
			System.out.println();
			x=x+2;
		}
			sc.close();
		}
	}

