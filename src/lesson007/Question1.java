package lesson007;

import java.lang.reflect.Array;

public class Question1 {

	public static void main(String[] args) {
		// verilen iki farklı arrayde tekrar eden sayıları bulunuz

		int array1[] = { 50, 60, 3, 4, 3, 9, 8 };
		int array2[] = { 1, 2, 50, 60, 3, 8, 9 };

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println("Tekrar eden sayı=" + array1[i]);

				}

			}
		}

	}

}
