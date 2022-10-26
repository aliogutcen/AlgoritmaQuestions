package lesson002;
import java.util.Scanner;
public class Question20 {

	public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);

//1'den 100'e kadar olan çift sayıların toplamını tek sayılara olan oranını bulunuz


double i=1;
double cift=0;
double tek=0;

for(i=1;i<=100;i++) {
	
	if(i%2==0) {
		cift= cift+i;
		
	}else {
		tek=tek+i;
	}
		
}

System.out.println("Çift sayıların toplamı=" +cift);
System.out.println("Tek sayıların toplamı=" +tek);
double oran=cift/tek;


System.out.println("Oranı=" +oran);
}

}
