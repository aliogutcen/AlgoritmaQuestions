package lesson004;

import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		// Kullanıcıdan bi kelime alalım (java)
		
		//0.indexi j
		//1.indexi a
		//2.indexi v
		//3.indexi a

		System.out.print("Bir kelime giriniz=");
		String name= scanner.nextLine();
		
		for (int i=0;i<=name.length()-1;i++) {
			System.out.println(i+". index "+ name.charAt(i));
			
			
		}
		
		
	}

}
