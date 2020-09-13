import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter the row number of the first coordinates! [1..8]");
		
		int f1 = sc.nextInt();
		
		System.out.println("Please enter the coloum number of the first coordinates![1..8]");
		
		int f2 = sc.nextInt ();
		
		System.out.println("Please enter the row number of the second coordinates![1..8]");
		
		int s1 = sc.nextInt();
		
		System.out.println("Please enter the coloum number of the second coordinate![1..8]");
		
		int s2 = sc.nextInt();
		
		if ( (s1%2>0 && s2%2>0 && f1%2>0 && f2%2>0) || (s1%2==0 && s2%2==0 && f1%2==0 && f2%2==0) || (s1%2>0 && s2%2>0 && f1%2==0 && f2%2==0) || (s1%2==0 && s2%2==0 & f1%2>0 && f2%2>0)) {
			System.out.println("The positions are with same color");}
			
			else {System.out.println("The positions are not with same color!");
		}
	}

}
