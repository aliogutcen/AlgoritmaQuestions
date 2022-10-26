package lesson002;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		
// Girilen 3 sayıyı büyükten küçüpe sıralayan program
		
		System.out.println("3 adet birbirinden farklı sayı giriniz");
		System.out.print("İlk sayınız=");
		int x1= scanner.nextInt();
		System.out.print("İkinci sayınız=");
		int x2= scanner.nextInt();
		System.out.print("Üçüncü sayınız=");
		int x3= scanner.nextInt();
		System.out.println("Girdiğiniz üç sayıya göre büyükten düşüğe sıralanmış şekli");

		
		int enBuyuk=x1;
			if(enBuyuk>x2 && x2>x3) {
				System.out.println("En büyük sayı" +x1+ "sonra "+x2+"en küçükte "+x3+"tür.");	
			}else if(enBuyuk>x2 && x3>x2) {
				System.out.println("En büyük sayı" +x1+ "sonra "+x3+"en küçükte "+x2+"tür.");
			}else if(enBuyuk<x2 && x1>x3) {
				System.out.println("En büyük sayı" +x2+ "sonra "+x1+"en küçükte "+x3+"tür.");			
			}else if(enBuyuk<x2 && x3>x1) {
				System.out.println("En büyük sayı" +x2+ "sonra "+x3+"en küçükte "+x1+"tür.");
			}else if(enBuyuk<x3 && x1>x2) {
				System.out.println("En büyük sayı" +x3+ "sonra "+x1+"en küçükte "+x2+"tür.");
			}else {
				System.out.println("En büyük sayı" +x3+ "sonra "+x2+"en küçükte "+x1+"tür.");
			}
				
			
	
		
scanner.close();
}
}
