import java.util.Scanner;

public class task7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Please enter are you healthy! (true or false)");	
		boolean health = sc.nextBoolean ();
		
		if (!health) {
	System.out.println("I'm sick and I'm not going outside!");
	
	System.out.println("Please enter a time!");
	int time = sc.nextInt();
	
	System.out.println("Please enter how much money you have!");	
	double money = sc.nextDouble();
		if (money>10) {
			System.out.println("I will go to buy a medicine!");
		}
		else {
			System.out.println("I don't have enough money and i'll stay at home and drink tea!");
		}
	}
		
		else  {
	System.out.println("Great, I'm going to meet some friends");
	
	System.out.println("Please enter a time!");
	int time = sc.nextInt();
	
	System.out.println("Please enter how much money you have!");	
	double money = sc.nextDouble();
		if (money>10) {
			System.out.println("I'll go to cinema with my friends!");
		}
		else {
			System.out.println("I'll go for a coffee, because I don't have enough money for cinema!");
			
		}
		}
			
	
		
		
	}
}
