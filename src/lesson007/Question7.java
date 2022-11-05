package lesson007;

import java.util.Scanner;

public class Question7 {


	public static int kacBasamakli(int x) {
		String sayiString=String.valueOf(x);
		int uzunluk=sayiString.length();
		return uzunluk;
	
	}

	public static void sayininBuyuklugu(int sayi) {
		int sayi1= kacBasamakli(sayi);
		if(sayi1>=4) {
			System.out.println("1000den büyük");
		}else System.out.println("100den küçük");
	}
	public static void main(String[] args) {
		// parametre olarak int alan ve int döndüren
        // girilen ifadenini kaç basamaklı olduğunu bulan method
        // type casting işlemi kullanalım
        // int Stringe çevirip öyle bulalım


		
		// kacBasamakli("500")
        //
        // girilen değeri stringe çevirip, çevirdiğimiz ifadenin uzunluğunu bulcaz.
		
		
		sayininBuyuklugu(2000);
	
		
	
	
	}	
}
