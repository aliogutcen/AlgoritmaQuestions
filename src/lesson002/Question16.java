package lesson002;
import java.util.Scanner;
public class Question16 {

public static void main(String[] args) {

	Scanner scanner= new Scanner(System.in);
		
//dışardan bir sayı alıyoruz. sayı için çarpım tablosu yazan program
	System.out.println("Bir sayı giriniz");
	int j= scanner.nextInt();
	int i=0;
	int carpim=0;
	for(i=0;i<=10;i++) {
		
		carpim=i*j;
		System.out.println(j+"x"+i+"="+carpim);
	}
scanner.close();
}
}
