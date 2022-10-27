package lesson003;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 5.'in kuvveti olup olmadığını bulan program

		System.out.print("Bir sayı giriniz= ");
		double sayi = scanner.nextDouble();
		boolean kontrolSayi = true;

		while (kontrolSayi == true) {
			if (sayi % 5 == 0) {
				sayi = sayi / 5;
			}
			if (sayi == 1) {
				System.out.print("5'in katı ");
				kontrolSayi = false;
			} 

		else {
			System.out.print("5'in katı değildir ");
			kontrolSayi = false;
		}
	}
}}
