package lesson007;

public class Question3 {
public static void main(String[]args) {
	String[]array= {"5","2","3","4","99","85"};
	int sayilar[]=new int[array.length];
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	for (int i = 0; i < sayilar.length; i++) {
		sayilar[i]= Integer.parseInt(array[i]);
			if(sayilar[i]>max) {
				max=sayilar[i];
			}if(sayilar[i]<min) {
				min=sayilar[i];
			}
	}
		System.out.println("max:"+max+" min: "+min);
	}
	
}
