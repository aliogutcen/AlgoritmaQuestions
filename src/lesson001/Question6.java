package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);

		// Kullanıcıdan alınan vize ve final notları ile öğrencinin geçip geçmediğini bulan program
		//50'den büyükse geçti düşükse kaldı
		//vize %40 , final%60
		
	System.out.println("Vize notunu giriniz=");
int vize= scanner.nextInt();
	System.out.println("Final notunu giriniz=");
int final1= scanner.nextInt();

float ortalama= vize*0.4f +final1*0.6f;

if (ortalama>=50) {
	System.out.println("Dersi "+ortalama +" ile geçtiniz");
}
else {
	System.out.println("Dersten kaldınız!!!");
}
scanner.close();

	}	
}

