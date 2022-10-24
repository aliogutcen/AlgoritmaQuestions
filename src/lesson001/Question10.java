package lesson001;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		// Girilen ortalamanın harf notuna göre geçip geçmediğini bulan program
		//90 üstü AA
		//80-90 arası BB
		//70-80 arası CC
		//60-70 arası DD
		//60tan küçükse FF
		
		System.out.println("Bir not giriniz=");
		int not=scanner.nextInt();
		if(not>=90) {
			System.out.println("AA ile geçtiniz");
		}
		else if(not>=80 && not<90) {
			System.out.println("BB ile geçtiniz");
		}
		else if(not>=70 && not<80) {
			System.out.println("CC ile geçtiniz");
		}
		else if(not>=60 && not<70) {
			System.out.println("DD ile geçtiniz");
		}
		else {
			System.out.println("FF ile geçtiniz");
		}
		scanner.close();
	}

}
