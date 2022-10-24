package lesson001;

import java.util.Scanner;

public class Ouestion1 {

public static void main(String[] args) {
Scanner	scanner= new Scanner(System.in);

/*Verilen iki sayının çarpımını veren program.
 
int x1=5 ,x2=15 ;
int carpim= x1*x2;
System.out.println("İki sayının çarpımı="+ carpim);
*/
	
//Girilen iki sayının çarpımını bulunuz
System.out.println("İlk sayıyı giriniz=");
int sayi1= scanner.nextInt();

System.out.println("İkinci sayıyı giriniz=");
int sayi2= scanner.nextInt();

int carpim= sayi1*sayi2;

System.out.println("İki sayının çarpımı="+ carpim);

scanner.close();
}

}
