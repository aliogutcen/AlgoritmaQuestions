package lesson003;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Girilen sayıya kadar tek olan sayıların toplamını bulan program

		System.out.print("Bir sayı giriniz= ");
		int x = scanner.nextInt();
		int toplam=0;
		
		while(x!=0) {
			
			if(x%2!=0)
			{
				toplam= toplam+x;
				
			}
			else {	
			}
			x--;
			
			
		}
		
		System.out.print("Tek sayılar toplamı= "+toplam);
		
		
		
	}

}
