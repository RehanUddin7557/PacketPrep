package sirModule;

import java.util.Scanner;

public class code_9_UserInput {
	
	
	//read data from console.......
	public static void main(String[] args) 
	{
			Scanner obj = new Scanner(System.in);
		    String data;
		    
		    do {
		    	 // Enter username and press Enter
			    System.out.println("Enter data :"); 
			    data = obj.nextLine(); 
			    
			    System.out.println("Username is: " + data); 
		    	}
		    	while(!data.equals("stop"));
		   
		}

}


//