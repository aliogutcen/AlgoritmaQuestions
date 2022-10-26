package lesson002;
import java.util.Scanner;
public class Question17 {
	// Girilen sayının faktöriyelini bulalım
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz=");
		int i = scanner.nextInt();
		System.out.print("Girilen sayının faktöriyeli hesaplanıyor");
	int	j;
	int	faktöriyel=1;
		
		for(j=i;j>=1;j--) {
			
			faktöriyel=faktöriyel*j;
					
		}
		System.out.print("faktöriyel"+ faktöriyel);
		
		scanner.close();
		

	}

}
