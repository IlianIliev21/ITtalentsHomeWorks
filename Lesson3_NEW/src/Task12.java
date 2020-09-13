
public class Task12 {
	public static void main(String[] args) {
		
		//Да се състави програма, която извежда всички естествени трицифрени числа, които нямат е еднакви цифри.
		
		int x = 999;
	
		for (int i=100;i<=x;i++) {
			
			int a = i%10;
			int b =(i/10)%10;
			int c = i/100;
			
			if (a != b && a != c && c != b) {
				System.out.println(i);
			}
					
		}
	}
}
