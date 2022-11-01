package lesson005;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] dizi= {"Türkiye","Japonya","Moğolistan","Fransa","Danimarka"};

		boolean kosul=true;
		
		while(kosul) {
			System.out.println("Bir değer giriniz");
		
			String dizi1= scanner.nextLine();
			for(int i=0;i<dizi.length;i++) {
				if (dizi1.equalsIgnoreCase(dizi[i])) {
					System.out.println("EŞİT");
					kosul=false;
				} 
					
			}		
		}
	
	}
}
