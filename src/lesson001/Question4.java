package lesson001;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
/*Verilen isim ve soyisim değerini Hello (İsim) (Soyisim) şeklinde yazdıran program

String isim= "Ali";
String soyAd= "Ogutcen";
				
System.out.println("Hello "+ isim+ " " + soyAd);
	*/
		
		System.out.println("Adınızı Giriniz=");
String isim = scanner.nextLine();
		System.out.println("Soyadınızı Giriniz=");
String soyAd= scanner.nextLine();
		System.out.println("Hoşgeldiniz=" +isim +" " + soyAd);
		
		scanner.close();
}
	
}
