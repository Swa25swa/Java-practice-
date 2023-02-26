package BasicToAdvanced;

public class corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int mynum=3;
	   // String website = "swati singh";
	    //char letter = 'r';
 
        //double decm = 5.99;
        //boolean mycard= true;
        
        //System.out.println(decm+"age of firm");
	    //System.out.println(website);
	    
	    //Arrays -
	    int[] arr = new int[7];
	    arr[0]=2;
	    arr[1]=4;
	    arr[2]=3;
	    arr[3]=7;
	    arr[4]=6;
	    arr[5]=9;
	    arr[6]=1;
	    
       int[] arr2 = {2,4,3,7,6,9,1};	

	   //How to print values present in array list using for loop
	    //for(int i=0; i< arr.length; i++)
	    {
		//	System.out.println(arr[i]);
	    	
	    }
	 //   for(int i=0; i< arr.length; i++)
	    {
		//	System.out.println(arr2[i]);
	    	
	    }
	    
	  String[] name = {"Swati","singh","docquity"};
	    
	    //	for(int i=0; i< name.length; i++)
	    	{
	    	//	System.out.println(name[i]);
	    	}
	    		
	    	//Enhanced for loop - To omit out the above mentioned 3 conditions we can create variable 's' and 
	    	//this stores all values of array  list and upon every iteration it will pick one value and print as 's'
	    	for( String s: name)
	    	{
	    		System.out.println(s);
	    	}
	    	
	    	
	    	
	    	
	    	
	    
	    
	    
	    
	    
	    
	    
	    
	   
	    
	}

}
