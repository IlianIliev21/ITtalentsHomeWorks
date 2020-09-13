import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		
		System.out.println("Please enter X!");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.println("Please enter Y!)");
		
		int y = sc.nextInt();
		
		if (x>y) {
			System.out.println(y + "" + x); }
			else {
				System.out.println(x + " " +y);
			
		}
				
	}
}
