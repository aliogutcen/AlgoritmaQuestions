package lesson008;

import java.util.Arrays;
import java.util.Scanner;

public class Question004 {
//tersCevir metodu olacak
// parametre olarak int [] parametre alacak.

	public static void tersCevir(int[] dizi) {
		int tersDizi[] = new int[dizi.length];
		for (int i = 0; i < tersDizi.length; i++) {
			tersDizi[dizi.length - i - 1] = dizi[i];
		}
		for (int tersSayilar : tersDizi) {
			System.out.print(tersSayilar);
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("kaç dizi olacak");
		int sayi = scanner.nextInt();
		int dizi[] = new int[sayi];
		for (int i = 0; i < dizi.length; i++) {
			System.out.println("bir sayı griniiz");
			dizi[i] = scanner.nextInt();
		}
		System.err.println("Yeni dizi=" + Arrays.toString(dizi));

		tersCevir(dizi);
	}
}
