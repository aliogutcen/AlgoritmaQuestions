package lesson001;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		// Girilen 3 sayıdan en büyük olanı yazdırın

		/*
 		System.out.println("İlk sayıyı giriniz");
	int a= scanner.nextInt();
		System.out.println("İkinci sayıyı giriniz");
	int b= scanner.nextInt();
		System.out.println("Üçüncü sayıyı giriniz");
	int c= scanner.nextInt();
		
		if (a>b && b>=c) {
			System.out.println("En büyük sayı"+a);
		}
		else if (b>a && a>=c) {
			System.out.println("En büyük sayı"+b);
		}
			else {
				System.out.println("En büyük sayı"+c);
			
			}
			*/
		
			System.out.println("İlk sayıyı giriniz");
		int a= scanner.nextInt();
			System.out.println("İkinci sayıyı giriniz");
		int b= scanner.nextInt();
			System.out.println("Üçüncü sayıyı giriniz");
		int c= scanner.nextInt();
		
		int enBuyuk= a;
		if(enBuyuk<b) {
			enBuyuk=b;
			
		}
		if(enBuyuk<c) {
			enBuyuk=c;
			
		}
		
		System.out.println("En büyük sayı"+ enBuyuk);
			scanner.close();
		}
		
	}


