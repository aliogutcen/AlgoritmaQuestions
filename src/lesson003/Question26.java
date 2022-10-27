package lesson003;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		//kullanıcıdan taban ve üs sayısı alıcaz
		
		System.out.print("Bir sayı giriniz= ");
		int x = scanner.nextInt();
		System.out.print("ikinci sayı giriniz= ");
		int y = scanner.nextInt();
		int j=0;
		int carpim=1;
		while(j<y) {
			j++;
			carpim=carpim*x;
				
		}
			
		System.out.print(x+"^"+y+"="+carpim);
		
		
		
	}
}
