package additionalcourse;

import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// taban sayısı ve üs sayısı alıp çıktı

		System.out.print("Taban sayısı giriniz= ");
		int a = scanner.nextInt();
		System.out.print("Üs sayısını giriniz= ");
		int b = scanner.nextInt();
		int i;
		int carpim = 1;
		for (i = 1; i <= b; i++) {
			carpim = carpim * a;

		}

		System.out.println(a + "^" + b + "=" + carpim);

	}

}
