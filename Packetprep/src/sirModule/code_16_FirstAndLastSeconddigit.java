package sirModule;

public class code_16_FirstAndLastSeconddigit {
public static void main(String[] args) {
		
		
		//
		//E.g.- NUMBER : 12345        OUTPUT : 1+4=5...... 45621   sum = 4+2
		
		
		
		//calculate sum of first and second last
		int num = 12345,r=0,counter=0,sum = 0;
		
		while(num > 0)
		{
			r = num % 10;//5//4//3
			 counter++;
			
			if(counter == 2) 
			{
				sum = sum + r;
			}
			num = num/10;//1234//123
		}
		sum = sum + r;
		System.out.println("Sum ...."+sum);
		
		
	}
}
