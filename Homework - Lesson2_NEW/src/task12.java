import java.util.Scanner;

public class task12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a day!");
		int day = sc.nextInt();
		
		System.out.println("Please enter a month!");
		int month = sc.nextInt();
		
		System.out.println("Please enter an year!");
		int year = sc.nextInt();
		
	if (day<31 && (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month ==12) )
		{System.out.println("The next date is " + "" + ++day + "," + month + "," + year);}
		
		else if (day<30 && (month==4 || month==6 || month==9 || month==11) ) {
		System.out.println("The next date is " + "" + ++day + "," + month + "," + year);}
		
		else if (day<28 && month==2) {
		System.out.println("The next date is " + "" + ++day + "," + month + "," + year);}
	
		else if (day==31 && (month==1 || month==3 || month==5 || month==7 || month==8 || month==10) )
		{System.out.println("The next date is " + "" + (day-30) + "," + ++month + "," + year);}
	
		else if (day==30 && (month==4 || month==6 || month==9 || month==11) ) {
		System.out.println("The next date is " + "" + (day-29) + "," + ++month + "," + year);}
		
		else if (day==28 && month==2 && (year%4!=0 || year%100==0 || year%400!=0)) {
		System.out.println("The next date is " + "" + (day-27) + "," + ++month + "," + year);}
	
		else if (day==31 && month==12) {
		System.out.println("The next date is " + "" + (day-30) + "," + (month-11) + "," + ++year);}
	
		else if (day==29 && month==2 && (year%4!=0 && year%400!=0)) {
		System.out.println("There is not 29,02 in this year!");}
	
		else if (day==29 && month==2 &&  ((year%4==0 && year%100!=0) || year%400==0 )) {
		System.out.println("The next date is " + "" + (day-28) + "," + ++month + "," + year);}
	
		else if (day==29 && month==2 && (year%400!=0 && year%100==0)) {
		System.out.println("There is not 29,02 in this year!");}
	
	sc.close();
	}

}
