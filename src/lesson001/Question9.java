package lesson001;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		// Dairenin alanını ve çevresini bulan program r'yi kullanıcıdan al

		System.out.println("Dairenin yarı çapını giriniz=");
		int r= scanner.nextInt();
		float pi= 3.14f;
		float daireAlani= (float)(pi*r*r);
		int daireCevresi= r*r;
		System.out.println("Dairenin alanı="+ daireAlani);
		System.out.println("Dairenin alanı="+ daireCevresi);
		
		scanner.close();
	}
	

}
