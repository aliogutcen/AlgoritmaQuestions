package lesson003;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		// Girilen sayının basamaklarını toplamını bulan program
		// 755 7+5+5
		//do -while
			
		System.out.print("Bir sayı giriniz= ");
		int x= scanner.nextInt();
		
		int kalan=0;
		int toplam=0;
		
		do {
			kalan=x%10;
			x=x/10;
			toplam+= kalan;
			
				
			
		} while (x!=0); //sayı 0 değilse scope sürekli çalışacak
		
		System.out.print("Toplam= "+toplam);
		
		
	}

}
