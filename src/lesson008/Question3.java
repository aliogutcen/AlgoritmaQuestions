package lesson008;

import java.util.Scanner;

public class Question3 {
//Bir öğ-rencinin vize ve final notlarını girdiği ve ortalamasını hesapladıgı program
	//vize notunun %40 final%60
	//puanHesapla içerisine paremetre olarak vize ve finali alacak
	//ortalaması 60 üzerindeyse geçti 50 ile -60 arasında ise şartlı geçti 50 den düşükse dersten kaldı
	
	public static void puanHesapla(int vize,int final1) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("vize notu giriniz");
//		 vize=sc.nextInt();
//		System.out.println("final notu giriniz");
//		final1=sc.nextInt();
		int ortalama= (vize*40/100)+(final1*60/100);
			if(ortalama>60)
				System.out.println("dersi geçtiniz");
			else if(ortalama>50 && ortalama<60)
				System.out.println("kosullu geçtiniz");
			else
				System.out.println("dersten kaldınız");
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("vize notu giriniz");
	int vize=sc.nextInt();
	System.out.println("final notu giriniz");
	int final1=sc.nextInt();
	
	puanHesapla(vize,final1);

}}
