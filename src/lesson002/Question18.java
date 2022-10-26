package lesson002;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		// Girilen sayının hangi beden oldugunu söyleyen program
		//samall 29
		//medium 42
		//large 44
		//xl 48
		
		
		System.out.println("Bir beden giriniz");
		int i=scanner.nextInt();
		
		switch (i) {
		case 29:
			System.out.println("Small");
			break;
		case 42:
			System.out.println("Medium");
			break;
		case 44:
			System.out.println("Large");
			break;
		case 48:
			System.out.println("Large");
			break;
		default:
			System.out.println("Belirsiz");
			break;
		}

	}

}
