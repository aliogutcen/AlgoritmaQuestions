package lesson005;

public class Question9 {

	public static void main(String[] args) {
		int[]sayilar= {1258,120,5,85,-256,16,0,36,81,14};
		int enBuyuk= sayilar[0];
		int	ikinciSayi = sayilar[1];
		for (int i = 1; i < sayilar.length; i++) {
			if(sayilar[i]>enBuyuk) {
			ikinciSayi=enBuyuk;
				enBuyuk=sayilar[i];
			}
			else if(sayilar[i]>ikinciSayi) {
				ikinciSayi=sayilar[i];
			}
		}
		System.out.println("ikinci sayı"+ikinciSayi);
	}

}
