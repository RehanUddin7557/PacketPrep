package sirModule;

public class code_4_while {

	public static void main(String[] args) {
		
		//adding all sting  1+2+&+9
		int sum=0,num=12795,r;
		
		while(num > 0)
		{
			r = num % 10; ///1279 % 10 =9     ////127*10=1270   checks last value 9
			
			sum = sum+r;
			
						//sum=0+5
						//sum=5
			
						//sum=5+9
						//sum=14
						
						//sum=14+7
						//sum=21
			
						//sum=21+2
						//sum=23
			
						//sum=23+1
						//sum=24
			
  			
			num = num/10;  ///  1279/10 
			
			
			
		}
	System.out.println("Sum......is : " + sum);
		
		
		
		
		
		
		
		
	}
	
}
