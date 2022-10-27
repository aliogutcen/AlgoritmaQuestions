package lesson003;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int x = scanner.nextInt();

		int i = 1;
		int a=0;
		
		while (i <= x / 2) {
			if (x % i == 0) {
			a= a+i;
			}
			
			i++;
		}
			
		if(a == x) { 
				System.out.println(x + " is a perfect number.");
			} 
			else 
				System.out.println(x + " is not a perfect number.");
		}
}
