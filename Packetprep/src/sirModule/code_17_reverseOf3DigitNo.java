package sirModule;

public class code_17_reverseOf3DigitNo

{
	public static void main(String[] args) 
	{
	///Reverse of 3 digit numbers 132   // 2 * 1 =2 //3...  2*10+ 3= 23////1......23*10 +  1 =231	
//45892 .....2...9.... 2* 10+9 ==29 ....8....29*10+8 =298
		
		
		//4589211111 we need to use long
		
int num = 45892,r,res=0;
//long num=45,r,res=0; /////8745= 87*pow(10,2) + 4*pow(10,1) + 5*pow(10,0);
		

	while(num > 0) 
	{
		r = num % 10;
		res = res * 10 + r; //---->for 132 ///////////////2///2*10+3 =23///1...23*10+1==231 
		num = num/10;
	}
System.out.println("Result....."+res);
		
}
}