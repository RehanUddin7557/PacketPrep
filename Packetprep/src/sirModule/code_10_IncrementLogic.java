package sirModule;

public class code_10_IncrementLogic {

	public static void main(String[] args) {
	
		int x=0;
		int y=0;
		
		
		for(int z=0; z<5; z++)//In && (1)(1)---->(1)
										
		{
			if ((++x > 2) && (++y > 2))  //x=0,x=1,x=2,x=3,x=4,x=5   because 3>2     then go to y   ------> y=1
																						//y=2
			{																		    //y=3
				x++;
			}	
		}
		
		System.out.println(x +  " " +y);

	}
}

//options
	
	//a)5 2
	//b)5 3
	//c)6 3  -------->Correct
	//d)6 4