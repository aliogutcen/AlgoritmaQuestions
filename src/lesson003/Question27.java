package lesson003;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Kullanıcıdan sürekli sayı alıcaz
		// 0'a bastığımız zaman programdan cıkacak ve carpimi

		int carpim = 0;
		boolean kosul = true;
		while (kosul == true) {
			System.out.print("Bir sayı giriniz= ");
			int x = scanner.nextInt();
			if (x > 0) {

				carpim = 1;
				carpim = carpim * x;

			} else if (x == 0) {
				System.out.println("Programdan çıktınız");
				kosul = false;
			}
		}

		System.out.println("çarpımları =" + carpim);
	}
}