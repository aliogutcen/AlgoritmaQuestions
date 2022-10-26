package lesson002;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		/*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
       
        Balık Burcu : 20 Şubat - 20 Mart
      */
		
		
		System.out.print("Kaçıncı ayda doğdunuz=");
		int ay= scanner.nextInt();
		System.out.print("Ayın kaçında doğdunuz=");
		int day=scanner.nextInt();
		
		
		switch (ay) {
		case 1:
		if(day<22) {
			System.out.print("Oğlak burcusunuz");
		}
		else System.out.println("KOVA BURCUSUNUZ");
	
		break;
		
		case 2:
			if(day<20) {
				System.out.print("Kova burcusunuz");
			}
			else System.out.println("Balık BURCUSUNUZ");
		
			break;
			
		case 3:
			if(day<21) {
				System.out.print("Balık burcusunuz");
			}
			else System.out.println("Koç BURCUSUNUZ");
		
			break;
			
		case 4:
			if(day<21) {
				System.out.print("Balık burcusunuz");
			}
			else System.out.println("Koç BURCUSUNUZ");
		
			break;
		default:
			break;
		}
		
		if()
		
		
	}

}
