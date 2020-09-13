import java.util.Scanner;

public class task10 {
	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many liters of water you have in you container [10...9999]");
		
		int c = sc.nextInt();
		
		int times = c/5;
		

		
		if (c%5==2) {
			System.out.println(times + " buckets of 3L!");
			System.out.println(times + " buckets of 2L!" );
			System.out.println("And 1 additional bucket of 2L!");
		}
		else if (c%5==3) { 
			System.out.println(times + " buckets of 3L!");
			System.out.println(times + " buckets of 2L!" );
			System.out.println("And 1 additional bucket of 3L!");
		}
		else if (c%5==4) {
			System.out.println(times + " buckets of 3L!");
			System.out.println(times + " buckets of 2L!" );
			System.out.println("And 2 additional buckets of 2L!");
		}
		else if (c%5==1) { 
			System.out.println(times + " buckets of 3L!" );
			System.out.println(times-1 + " buckets of 2L!");
			System.out.println("And 1 additional bucket of 3L!");
		}
		
		
	}

}
