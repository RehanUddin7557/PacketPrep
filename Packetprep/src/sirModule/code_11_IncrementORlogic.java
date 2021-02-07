package sirModule;

public class code_11_IncrementORlogic {

	public static void main(String[] args) {
		int x=0;
		int y=0;
		
		
		for(int z=0; z<5; z++)//In ||  we have  (1)(0)--->1
											//  (0)(0)--->0
											//  (1)(0)--->1
		{                                 
			if ((++x > 2) || (++y > 2))  //x=0,x=1,x=2,x=3,x=4,x=5   because 3>2     then go to y   ------> y=1
																						//y=2
			{																		    
				x++;
			}	
		}
		
		System.out.println(x +  " " +y);


	}

}
