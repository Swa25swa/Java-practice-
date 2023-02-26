package BasicToAdvanced;

public class methodsdemo {

	public static void main(String[] args) {
		//Creation of object to access class methods 
		 
		methodsdemo d = new methodsdemo();
		String name = d.getData();
		System.out.println(name);
		methodsdemo2 d1 = new methodsdemo2();
		d1.getUserData();
 	}
     //why methods -
	public String getData()
	{
	System.out.println("swati singh");
	return "swa swa";
	
	}
	
}
