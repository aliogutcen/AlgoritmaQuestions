package lesson008;

import java.util.Scanner;
//Doğum yılınızı girerek yaşınızı
//ve hangi yüzyılda doğdunu hesaplayan metodu yazınız
//3 farklı metot yazalım

public class Question001 {
	
	public static int yasHesapla(int yil) {
		int sene = 2022;
		int kacYasinda = sene - yil;
		return kacYasinda;
	}

	public static int kacinciYuzYil(int yil) {
		int yuzyil = yil / 100 + 1;
		return yuzyil;

	}
	public static void bilgileriYazdir() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("DOGUM YILINIZI GİRİNİZ");
	int yil = scanner.nextInt();
	int yas= yasHesapla(yil);
	int yy= kacinciYuzYil(yil);
	System.out.println(yas+" yaşındasınız ve "+ yy+" .yüzyılda doğmuşsunuz");
	}
	
	
	
	public static void main(String[] args) {
		
		bilgileriYazdir();

		
	}

}
