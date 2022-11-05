package lesson007;

import java.util.Scanner;

public class Question5 {
	
	//public static void toplamaIslemi(int x,int y) {
	//System.out.println("toplamları:"+(x+y));
	//}
	
	public static int toplam(){
	Scanner scanner=new Scanner(System.in);
	System.out.println("ilk sayıyı giriniz");
	int x=scanner.nextInt();
	System.out.println("İkinci sayıyı giriniz");
	int y=scanner.nextInt();
	int toplama=x+y;
	return toplama;
	}
	
	public static void main(String[] args) {
	
		
//		int topla =  toplam(5, 10);
//		
//		if(topla<10) {
//			System.out.println("TOPLAMI 10DAN AZ");
//		}
//		else
//			System.out.println("TOPLAMI 10DAN FAZLA");
		
		int i=0;
		for(i=0;i<10;i++) {
			System.out.println(i+" .toplama işlemi= "+toplam());
		}
		
		
		
		
		
	}
}
