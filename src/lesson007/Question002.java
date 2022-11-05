package lesson007;

public class Question002 {

	public static void main(String[] args) {
		// verilen dizide rakamların farkının en az olduğu sayıların farkı
		int[]array= {1,5,-4,3};
		//int mutlakDeger=Math.abs//
		int cikarma;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			 for (int j = i+1; j < array.length; j++) {
				
				 cikarma=Math.abs(array[i]-array[j]);
				if(cikarma<min) {
					min=cikarma;
				}
				}
				
				 
				 
				 
				 
			}
			
			System.out.println(min);
			
		}
	
		
		
		
	

}
