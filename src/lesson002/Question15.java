package lesson002;
import java.util.Scanner;
public class Question15 {

public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
		// Girilen sayıya kadar  olan sayıların toplamı

		System.out.println("Bir sayı giriniz=");
		int i= scanner.nextInt();
		int j;
		int toplam=0;
		for(j=0;j<=i;j++) {
			toplam=toplam+j;	
		}
			System.out.println("Toplam"+toplam);
			
	scanner.close();
	
	
	}

}
