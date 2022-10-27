package additionalcourse;

public class Question36 {

	public static void main(String[] args) {
		
	
        String name="bilgeadam";
        String yeniString="";
        String name2 ="";
        for (int i=0; i < name.length(); i++)
        {
                yeniString = name.charAt(i) + ",";
                name2 = name2 + yeniString;  

        }
        
        
       System.out.print(name2);
}
}