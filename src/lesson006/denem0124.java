package lesson006;

public class denem0124 {

	public static void main(String[] args) {

		String[] asa = { "Türkiye", "Kerem", "Furkan", "Mert", "SS" };

		String[] asaa = { "1", "2", "3", "4", "5" };
		String[][] nw = new String[5][5];

		for (int i = 0; i < nw.length; i++) {
			for (int j = 0; j < nw[i].length; j++) {
				nw[i][j] = asa[i] + asaa[j];

				System.out.print(nw[i][j] + " ");

				// 		0 			1
				// 0 //Türkiye1
				// 1 //Türkiye2
				// 2 //Türkiye3
				// 3 //Türkiye4
				// 4 //Türkiye5

				
				
			}
			
		}

	}

}
