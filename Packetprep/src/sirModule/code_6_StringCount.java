package sirModule;

public class code_6_StringCount {

	public static void main(String[] args)
	{
		 String string = "11111";    
	     int count = 0 ;  
	          
	      //Counts each character except space    
	      for(int i = 0; i < string.length(); i++) 
	      {    
	          if(string.charAt(i) != ' ') //for space not count   
	              count++;    
	      }    
	          
	      //Displays the total number of characters present in the given string    
	      System.out.println("Total number of characters in a string: " + count);    
	}

}
