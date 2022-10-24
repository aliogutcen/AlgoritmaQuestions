package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	
		
/*Verilen ürünün satış fiyatının içinde %18 kdv'ye %15 olduğunu biliyoruz.
Verilen ürünün ham fiyatını bulunuz.
		
int ürünFiyati= 100000;
int kdvCikinca= ürünFiyati-(ürünFiyati*18/100);
int karCikinca= kdvCikinca-(kdvCikinca*15/100);
	
System.out.println("Ürünün net fiyatı=" + karCikinca);
*/
		
//Kullanıcıdan alınan ürünün satış fiyatının içinden %18 kdv'ye %15 olduğunu biliyoruz.Ham fiyatını hesaplayınız
		
	
	System.out.println("Ürün fiyatını giriniz=");
int ürünFiyati= scanner.nextInt();
int kdvCikinca= ürünFiyati-(ürünFiyati*18/100);	
	System.out.println("KDV çıkınca fiyatı=" + kdvCikinca);
int karCikinca= kdvCikinca-(kdvCikinca*15/100);
	System.out.println("Ham ürün fiyatı=" + karCikinca);
	
	scanner.close();	
	}

}
