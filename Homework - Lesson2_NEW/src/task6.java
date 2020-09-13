import java.util.Scanner;

public class task6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of A!");
		int a = sc.nextInt();
		System.out.println("Please enter the value of B!");
		int b = sc.nextInt();
		System.out.println("Please enter the value of C!");
		int c = sc.nextInt();
		
		int temp = a;
		int temp2 = b;
		int temp3 = c;
		
		a = temp2;
		b = temp3;
		c = temp;
		
		System.out.println(" A = " + a + " B = " + b + " C = " + c);
		
		
	}

}
