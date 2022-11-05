package lesson006;

public class denem3 {

	public static void main(String[] args) {
		int [][] sira1= {{1,2},{2,3}};
		int [][] sira2= {{2,3},{4,5}};
		int[][]sira3= new int[2][2];
		
		
		for (int i = 0; i < sira3.length; i++) {
			for (int j = 0; j < sira3[i].length; j++) {
				sira3[i][j]= sira1[i][j]+sira2[i][j];
				System.out.print(sira3[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
	}

}
