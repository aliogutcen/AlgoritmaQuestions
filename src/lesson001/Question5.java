package lesson001;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		
	//Girilen Tl değerini USD'ye çeviren program 1USD=18.25
		
	System.out.println("Kaç TL çevirmek istiyorsunuz=");
	double tl= scanner.nextDouble();
	double dolar= tl/18.25;
	
	System.out.println("Şu kadar " + tl +" TL karşılığında " +dolar +" dolar ediyor");
	
	scanner.close();
	
	
}

}
