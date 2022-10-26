package lesson002;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		//telefona ve maile bir kod gelecek
		//kullanıcıdan emaile gelen kodu ve telefona gelen kodu alıcaz
		//bunları karşılaştırıcaz
		//ikiside uyuşuyorsa sisteme kaydolduk.
		//telefonu dpğru email yanlıs==> emaili düzgün girinizi
		
		
	
	System.out.println("Telefona ve maile gelen kodları giriniz");	
	System.out.print("Telefona gelen kodu giriniz=");
		int kod=scanner.nextInt();
	System.out.print("Maile gelen kodu giriniz=");	
		int mailKod=scanner.nextInt();
		
	System.out.println("Girdiğiniz bilgilere göre");	
			
	int onayMail=555;
	int telefonMail=555;
	
	
	if(onayMail==mailKod && telefonMail==kod) {
		System.out.print("Sisteme kaydoldunuz!");
		
	} else if(onayMail==mailKod || telefonMail!= kod) {
		System.out.print("Telefona gelen kodu tekrar giriniz");
		
	}else if(onayMail!=mailKod || telefonMail== kod) {
		System.out.print("Maile gelen kodu tekrar giriniz");
		
	}else {
		System.out.print("Telefon ve maile gelen kodu tekrar giriniz");
	}
		
		scanner.close();	
}
}
