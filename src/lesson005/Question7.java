package lesson005;

public class Question7 {

	public static void main(String[] args) {
		int[]sayilar= {0,120,5,85,-256,16,1258,81,14};
		int cift=0;
		int tek=0;
		for (int i = 0; i < sayilar.length; i++) {
			
			if(sayilar[i]%2==0) {
				cift=cift+sayilar[i];
				
			}else if(sayilar[i]%2!=0) {
				tek=tek+sayilar[i];
				
				
			}
			
		}
	
		System.out.println("ÇİFT SAYILAR TOPLAMI"+cift);	
		System.out.println("TEK SAYILAR TOPLAMI"+tek);
	}

}
