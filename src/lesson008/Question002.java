package lesson008;

import java.util.Scanner;

public class Question002 {

	public static void asalMi(int sayi) {
		int sayac = 0;
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				sayac++;
			}
		}
				if (sayac == 1) {
					System.out.println("sayı asaldır");
				} else {
					System.out.println("sayı asal değildir");
				}
			}
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi giriniz:");
		int sayi = scan.nextInt();
		asalMi(sayi);

	}

}
