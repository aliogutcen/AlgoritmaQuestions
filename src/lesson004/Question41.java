package lesson004;

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir kelime giriiniz");
		String name = scanner.nextLine();
		System.out.println("Hangi harfi öğrenmek istiyorsunuz");
		String st = scanner.nextLine();
		int sayac = 0;
		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == st.charAt(0)) {
				sayac++;
			}

		}

		System.out.print(sayac + "kere e kullanıldı");

	}

}
