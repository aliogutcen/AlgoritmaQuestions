package additionalcourse;

public class Question37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Str1 = "bilgeadam";
		String newString = "";
		String Str2 = "";
		for (int i = 0; i <=Str1.length()-1 ; i++) {
			newString = Str1.charAt(i) + ",";

			Str2 = Str2 + newString;

		}
		Str2 = Str2 + Str1.charAt(Str1.length() - 1);
		System.out.println(Str2);
	}

}
