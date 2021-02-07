package sirModule;

public class code_5_BiggestvalueInString
{

	public static void main(String[] args) 
	{
	int max=0,num=1279839,r; // 131513366899
		
		while(num > 0) 
		{
			
			r = num % 10;// 1279 % 10 
			
				if(r == 9) 
				{
				max = r;
				break;
				}
				else if(max < r )
				{
				max = r;
				}
				
			num = num / 10;// 1279 / 10 == 127
		}

		System.out.println("Max ...."+max);
	}

}
