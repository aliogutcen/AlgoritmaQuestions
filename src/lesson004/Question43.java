package lesson004;

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// girilen mail ve pass doğruysa sisteme giriş
		/*
		System.out.print("Email adresinizi giriniz=");
		String email = scanner.nextLine();
		System.out.print("Parola giriniz=");
		String password = scanner.nextLine();
		System.out.print("Parolayı tekrar giriniz=");
		String repassword = scanner.nextLine();

		String kontrolMail = email.trim();
		kontrolMail = email.toLowerCase();
		*/
		/*
		 if (email.equals(kontrolMail) && password.equals(repassword) &&
		  email.contains("@")) { System.out.println("Sisteme giriş yaptınız");
		  
		  } else {
		  
				if (email.equals(kontrolMail) && email.contains("@")) {
		  System.out.println("Şifreyi tekrar giriniz"); } 
				else {
		  System.out.println("Maili tekrar giriniz"); }
		  
		  }	 
*/
		boolean kontrol = true;

		while (kontrol) {
			System.out.print("Email adresinizi giriniz=");
			String email = scanner.nextLine();
			System.out.print("Parola giriniz=");
			String password = scanner.nextLine();
			System.out.print("Parolayı tekrar giriniz=");
			String repassword = scanner.nextLine();

			String kontrolMail = email.trim();
			kontrolMail = email.toLowerCase();
			
			if (email.equals(kontrolMail) && password.equals(repassword) && email.contains("@")) {
				System.out.println("Sisteme giriş yaptınız");
				kontrol = false;
			}	else if (email.equals(kontrolMail) && email.contains("@")) {
				System.out.println("Şifreyi tekrar giriniz");
			} else {
				System.out.println("Maili tekrar giriniz");
			}

		}

	}
}
