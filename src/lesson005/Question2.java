package lesson005;

import java.util.Iterator;

public class Question2 {

	public static void main(String[] args) {
		// dizide a ile biten bi kelime varsa  o kelimeyi ? ile değiştirielmim
		
		String[] dizi = {"Amerika","Almanya","İsveç","Türkiye","Danimarka"};
		
		for(int i=0;i<dizi.length;i++) {
			if(dizi[i].endsWith("a")) {
			String dizi1 = dizi[i].replace(dizi[i], "?");
			System.out.println(i+".index "+dizi1);
			}		

		}
	
}
}