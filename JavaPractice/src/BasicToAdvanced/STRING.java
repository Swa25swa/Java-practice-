package BasicToAdvanced;

public class STRING {

	public static void main(String[] args) {
		// String is an object //string literal
		 //String s1 = "Swati singh appium";
		 //String s5 = "hello";

		//new

		//String s2 = new String("Welcome");
		//String s3 = new String("Welcome");
		
		 //BREAKING STRING - whitespaces
		                //- by name ex; singh -right side falls in 1 index ,left side 0 index 
		String s = "Swati singh appium";	
		String[] splittedString = s.split("singh");
		System.out.println(splittedString[0]);
		//System.out.println(splittedString[1]);
		//System.out.println(splittedString[2]);
		
		//trim white space near 2nd index 
		System.out.println(splittedString[1].trim());
		
		//Applying for loop -to iterate whole string
		for(int i=0;i<s.length();i++)
		
		{
			
			System.out.println(s.charAt(i));
		}
		
		
	}

}
