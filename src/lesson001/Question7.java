package lesson001;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		// Girilen sayının tek mi çift mi olduğunu bulan program?
		
		System.out.println("Sayı giriniz=");
		int sayi= scanner.nextInt();
		if(sayi%2==0) {
			System.out.println("Sayı çifttir");
		}
		else {
			System.out.println("sayı çift değildir");
		}
		scanner.close();
	}

}
