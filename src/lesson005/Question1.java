package lesson005;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		// Bizden bir kelime istenilcek (java)
        // hangi harfi değiştirmek istediğimizi sorcak (b)
        // eğer değiştirmek istediğimiz kelimeda yoksa,
        // döngü başa saracak ve tekrar kelime isteyecek eğer
        // varsa harfimiz değişecek
        // ve yeni kelimemiz ekrana basılcak
        
        //java
        // değiştirmek istediğiniz harf --> a
        //neyle değiştirmek istediğimiz harf --> b
        
        //jbvb
		
		
		boolean kosul=true;
		
		while(kosul) {
			System.out.println("Bir kelime giriniz=");
			String kelime=scanner.nextLine();
			System.out.println("hangi harfi değiştirmek istediğinizi yazınız");
			String harf=scanner.nextLine();
			System.out.println("hangi harfle değiştirmek istediğinizi yazınız");
			String harf1=scanner.nextLine();
			if(kelime.contains(harf)) {
				String kelime1= kelime.replace(harf, harf1);
				System.out.println("Yeni kelime "+kelime1);

				kosul=false;
			}else
				System.out.println("Yeni kelime giriniz");
		}
		
		
		
		
		
		
		

	}


}
