import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the value of X!" );
	int X = sc.nextInt();
	
	System.out.println("Enter the value of Y!");
	int Y = sc.nextInt();
	
	int temp = X;
	X = Y;
	Y = temp;
	
	System.out.println("When you change the values " + "X = " + X + " Y = " + Y);
		
		
	}
}
