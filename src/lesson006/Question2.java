package lesson006;

import java.util.Iterator;
import java.util.Scanner;

public class Question2 {

	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
	/*
	 * 8 10 3
	 * 10 4 12
	 */
		//bealdung
	int matris1[][]= {{5,6,2},{9,1,6}};  			// 0 0 0
	int matris2[][]= {{3,4,1},{1,3,6}};  			// 0 0 0
	int toplamMatris[][]= new int [2][3];
	
	for (int i = 0; i < toplamMatris.length; i++) {
		for (int j = 0; j < toplamMatris[i].length; j++) {
			toplamMatris[i][j]=matris1[i][j]+matris2[i][j];
	
			System.out.print(toplamMatris[i][j]+" ");
		}
				System.out.println();
	}

	}
	
		
	}

