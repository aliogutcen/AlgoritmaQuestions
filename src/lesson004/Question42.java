package lesson004;

import java.util.Scanner;

public class Question42 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// girilen kelimenin ilk önce hepsini büyük hatfe çevirip
		// daha sonra hepsini küçük

		// java

		String name = scanner.nextLine();
		name = name.toLowerCase();
		System.out.println("küçük harf"+name);
		name = name.toUpperCase();
		System.out.println("büyük harf"+name);
	}

}
