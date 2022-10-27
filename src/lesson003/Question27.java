package lesson003;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Kullanıcıdan sürekli sayı alıcaz
		// 0'a bastığımız zaman programdan cıkacak ve carpimi

		System.out.print("Bir sayı giriniz= ");
		int x = scanner.nextInt();
		int carpim = 1;
		int ilkDeger = 0;
		while (x > 0) {
			carpim = carpim * x;
			System.out.print("Bir sayı giriniz= ");
			x = scanner.nextInt();
			ilkDeger = 1;
		}

		if (ilkDeger == 0) {
			System.out.print("Programdan Çıktınız");
		} else {
			System.out.print("Programdan Çıktınız" + carpim);

		}

	}
}