package lesson003;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Girilen sayının, kaçıncı basamağında hangi sayı var onu
		
		System.out.print("Bir sayı giriniz= ");
		int sayi = scanner.nextInt();  
        int basamak;
        int i=1;
        while (sayi != 0){  
             basamak=sayi%10;
             sayi = sayi/10; 
             
            System.out.println(i+"ler basamağı"+basamak);    
            i=i*10; 
            
        }
	}

}
