import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		//Да се прочете число от екрана и да се изведе сбора на всяко число от 1 до въведеното.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number!");
		
		int number = sc.nextInt();
		
		int x = 1;
		
		for (int y = 2; y<=number ;y++) {
			x=x+y;
	
		}
	System.out.println(x);
	}
}
