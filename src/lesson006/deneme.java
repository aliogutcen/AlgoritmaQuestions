package lesson006;

import java.util.Scanner;

public class deneme {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] yeni = new String[2][3];

		for (int i = 0; i < yeni.length; i++) {
			for (int j = 0; j < yeni[i].length; j++) {
				System.out.println("Bir kelime giriniz");
				String kelime = scanner.nextLine();
				yeni[i][j] = kelime;
			}
			System.out.println();
		}
		for (int i = 0; i < yeni.length; i++) {
			for (int j = 0; j < yeni[i].length; j++) {
				System.out.print(yeni[i][j] + " ");
			}
			System.out.println();
		}

	}

}
