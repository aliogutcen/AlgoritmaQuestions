package lesson005;

public class Question8 {

	public static void main(String[] args) {
		// dizi içerisinde 2 ve 4'ün kaç kere geçtiğini
		// hangisinin daha fazla oldugunu söyleyin
			int cift=0;
			int cift2=0;
			int[] array= {1,3,4,2,2,9,8,8};
			for (int i = 0; i < array.length; i++) {
				if(array[i]==2) {
					cift+=1;
				
			}else if(array[i]==4) {
				cift2+=1;
			}
		
}
			if(cift>cift2)
				System.out.println("2ler daha fazla");
			else if(cift2>cift)
				System.out.println("4ler daha fazla");
			else
				System.out.println("sayılar eşit ublunur");
	}

}
