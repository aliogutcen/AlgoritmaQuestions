package lesson003;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		// girilen sayının faktöriyelini hesaplayan program
		//while ile
		
		System.out.print("Bir sayı giriniz= ");
		int x= scanner.nextInt();
		int faktoriyel=1;
		
		
		while(x>=1) {
		  faktoriyel=faktoriyel*x;
		  x=x-1;	  
		}			
		System.out.print("X= "+faktoriyel);
	}

}
