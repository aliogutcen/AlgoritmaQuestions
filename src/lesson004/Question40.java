package lesson004;

import java.util.jar.Attributes.Name;

public class Question40 {

	public static void main(String[] args) {
		// her virgülden öncesini aşağıya yazan program

		/*
		String string = "Java,Spring,Postgre,React";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ',') {
				System.out.println();
			} else {
				System.out.println(string.charAt(i));
			}
		}
		*/
		
		String string = "Java,Spring,Postgre,React";
		int index=0;
		
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ',')
			{
				System.out.println(string.substring(index,i));
				index=i+1;
			} 	
		}		
		System.out.println(string.substring(index));
	
		
}
}
