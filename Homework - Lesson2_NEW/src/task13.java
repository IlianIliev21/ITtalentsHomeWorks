import java.util.Scanner;

public class task13 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the temperature outside!");
	
	int x = sc.nextInt();
	
	if (x<-20) {
	System.out.println("Very cold!");}
	
		else if (x>-20 && x<=0) {
		System.out.println("It's cold!");}
	
		else if (x>0 && x<=15) {
		System.out.println("Its'cool outsie!");}
	
		else if (x>15 && x<=25) {
		System.out.println("It's hot outside");}
	
		else if (x>25) {
		System.out.println("It's very hot!");}
	}
}
