import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
	
		//Задача 10: Въведете число от клавиатурата и определете дали е просто.
		
		Scanner sc = new Scanner (System.in);
	    System.out.println("Please enter a number and see if the number is prime!");
	    
	    int num = sc.nextInt();
	    boolean isPrime = true;
	    
	    for (int x = 2; x<num; x++) {
	    	if (num%x==0) {
	   	        System.out.println("The number is not prime!");
	   	        isPrime = false;
	   	        break;
	    	}
	   	}
	    
	    if (isPrime) {
	    	System.out.println("The number is prime!");
	    }
	      
	    sc.close();
	  }
	}