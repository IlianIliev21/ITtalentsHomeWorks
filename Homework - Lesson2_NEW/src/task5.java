import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the value of A!");
		int a = sc.nextInt();
	System.out.println("Please enter the value of B!");	
		int b = sc.nextInt();
	System.out.println("Please enter the value of C!");
	 	int c = sc.nextInt();
	 	
	System.out.println("In descending order the numbers are");
	 	
	if (a>b && b>c) {
		System.out.println(a + " > " + b + " > " + c);}
	else if (a>c && c>b) {
		System.out.println(a + " > " + c + " > " + b);}
	else if (b>a && a>c) {
		System.out.println(b + " > " + a + " > " + c);}
	else if (b>c && c>a) {
		System.out.println(b + " > " + c + " > " + a);}
	else if (c>b && b>a) {
		System.out.println(c + " > " + b + " > " + a);}
	else if (c>a && a>b) {
		System.out.println(c + " > " + a + " > " + b);}
	else if (a==b || b==c || a==c ) {
		System.out.println("Same value of the numbers!");}
	
	
		
		
	}
}
