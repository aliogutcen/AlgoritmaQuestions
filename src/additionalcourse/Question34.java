package additionalcourse;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz= ");
		int i = scanner.nextInt();
		int j = 1;
		int toplam = 0;
		int sayac = 0;
		int ort = 0;
		for (j = 1; j <= i; j++) {

			if (j % 10 == 0) {
				toplam = toplam + j;
				sayac++;
			}

		}
		ort = toplam / sayac;
		System.out.println(
				"Toplam= " + " " + toplam + " " + sayac + "tane ortak sayi var ve toplama olan ortalaması= " + ort);
	}

}
