package lesson004;

import java.util.Scanner;

public class Question44 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		
		//kullanıcıdan bir kelime alın
		// eğer kelime a ile başlıyorsa kelimenin son indexini ekrana bastırın
		
		// eğer kelime b ile başlıyorsa ilk indexi @ ile değiştirin 
		//eğer a ve ya b ile başlamyırsao bbirinin indeksi bastını
		
		//replace
		//charAt();
		//kelime.startsWith("")
		//lenght
		
		System.out.print("Bir kelime giriniz=");
		String name = scanner.nextLine();
		
		if(name.startsWith("a")){
			System.out.println(name.length()-1);
			
		}else if(name.startsWith("b")){
			System.out.println(name.replace("b", "@"));
		}else
			System.out.println(name.charAt(1));
		
}}


