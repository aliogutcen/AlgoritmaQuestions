package lesson002;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		// Girilen sayının asal olup olmadığını bulan program

		System.out.println("sayı giriniz");
		int i= scanner.nextInt();
		int asalDegil=1;
		int j;
		for(j=2;j<i;i++) {
			
			if(i%j==0) {
				asalDegil=0;
			}
			
		}
		if(asalDegil==0) {
			
			System.out.println(i+"asal değildir");
		}
		else {
			System.out.println(i+"asaldir");
		}
	
	
	
}
	}


