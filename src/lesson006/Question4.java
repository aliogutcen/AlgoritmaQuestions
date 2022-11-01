package lesson006;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		//çağlaI
		//çağlaİ
		// Girilen kelimede türkçe karakter var ise bunu ing karaktere çevirelim
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
		
		
		System.out.println("Kelime giriniz");
		String kelime=scanner.nextLine();
		
		
		
		for (int i = 0; i < turkceKarakter.length; i++) {
		kelime=kelime.replace(ingilizceKarakter[i], turkceKarakter[i]);
		}
		System.out.println(kelime);
	}

}
