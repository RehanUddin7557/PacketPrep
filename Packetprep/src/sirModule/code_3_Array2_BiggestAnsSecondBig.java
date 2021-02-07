package sirModule;

public class code_3_Array2_BiggestAnsSecondBig {

	public static void main(String xyz[]) {
//		int[] num = {10,23,78,3,7};
		int[] num = {-10,-10,-10,-10};
		
		int max=num[0],secondMax=num[0];
		boolean isSecondFound = false;
		
		
//Biggest Number	
		for(int index=1; index<num.length; index++)
		{
			if(num[index] > max) 
			{
				max = num[index];
			}
		}
		
    System.out.println("Biggest Num...."+max);
//Second Max number
    
		for(int index=0;index<num.length;index++) 
		{
			if( (num[index] > secondMax)  && (num[index] != max))
			{
				secondMax = num[index];
				isSecondFound = true;
			}
		}
	if(isSecondFound == true)
		System.out.println("max second value is ....." + secondMax);
	else
		System.out.println("No higest second Number");
		
	}
}
