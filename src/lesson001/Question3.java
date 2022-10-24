package lesson001;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
/*Verilen iki sayıdan hangisinin büyük olduğunu bulan program
	
int x1=5 , x2=12;
		
if(x1>x2) {
			
System.out.println("En büyük sayı="+ x1);	
		}
else if(x1==x2) {
System.out.println("Sayılar eşittir");
		}
else {
System.out.println("En büyük sayı="+ x2);
	}		
*/
		
		
		//Girilen İki sayıdan hangisinin büyük olduğunu söyleyen program yazınız
		
			System.out.println("Birinci sayıyı giriniz=");
	int x1= scanner.nextInt();
			System.out.println("İkinci sayıyı giriniz=");
	int x2= scanner.nextInt();
	if(x1>x2) {
			
			System.out.println("En büyük sayı x1 ="+ x1);	
		}
	else if(x1==x2) {
			System.out.println("Sayılar eşittir");
		}

	else {
			System.out.println("En büyük sayı x2 ="+ x2);
			
		}
		
	scanner.close();
	}

}
