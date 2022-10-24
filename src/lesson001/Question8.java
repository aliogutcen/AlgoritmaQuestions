package lesson001;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Kenarları girilen sayının nasıl bir üçgen olduğunu söyleyin
		
		System.out.println("İlk kenarı giriniz=");
		int a= scanner.nextInt();
		System.out.println("İkinci kenarı giriniz=");
		int b= scanner.nextInt();
		System.out.println("Üçüncü kenarı giriniz=");
		int c= scanner.nextInt();
		
		if(a==b|| b==c|| a==c) {
			System.out.println("İkiz kenardır");	
				
		}
		else if(a==b|| a==c|| b==c){
			System.out.println("Eşkenar üçgendir");
		}
		else {
			System.out.println("Çeşit kenardır");
		}
		scanner.close();
	}

}
