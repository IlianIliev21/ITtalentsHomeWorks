import java.util.Scanner;

public class task8 {
	public static void main(String[] args) {
		
		System.out.println("Please enter a number!");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int num = number;
		
		int a = num/1000;
		int d = num%10;
		num = num/10;
		int c = num%10;
		num = num/10;
		int b = num%10;
		
		int y = (a*10)+d;
		int x = (b*10)+c;
		
		if (y>x) {
			System.out.println(y + " > " + x);}
		else if (y<x) {
			System.out.println(y + " < " + x); }
		else if (y==x){
			System.out.println(y + " = " + x); }
			
		}
				
		
				
	
}
