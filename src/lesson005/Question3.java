package lesson005;

public class Question3 {

	public static void main(String[] args) {
		int[] sayilar= {0,120,-5,-85,-256,16,1258,81,14};
		//verilen arreyde 9 dan küçük sayıları 100 ile değiştir
		//kaçıncı index değişti ona bakalım.
		
		for(int i=0;i<sayilar.length;i++) {
			if(sayilar[i]<0) {
				sayilar[i]=100;
				int yeniSayilar=sayilar[i];
				System.out.println(i+".index değişti==>"+yeniSayilar);
			}
			
		}
	
}
}