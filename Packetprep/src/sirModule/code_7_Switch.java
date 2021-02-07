package sirModule;

public class code_7_Switch {

	public static void main(String[] args)
	{
		long num=111334;
		int r = 0; 
		int c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
		
		
		while(num > 0) 
		{
			r= (int)num%10;
			switch (r) 
			{
			case 0: c0++;
			break;
			case 1: c1++;
			break;
			case 2: c2++;
			break;
			case 3: c3++;
			break;
			case 4: c4++;
			break;
			case 5: c5++;
			break;
			case 6: c6++;
			break;
			case 7: c7++;
			break;
			case 8: c8++;
			break;
			case 9: c9++;
			break;
			}
		num=num/10;
		}
		System.out.println("0s count  is ...." +c0 );
		System.out.println("1s count  is ...." +c1 );
		System.out.println("2s count  is ...." +c2 );
		System.out.println("3s count  is ...." +c3 );
		System.out.println("4s count  is ...." +c4 );
		System.out.println("5s count  is ...." +c5 );
		System.out.println("6s count  is ...." +c6 );
		System.out.println("7s count  is ...." +c7 );
		System.out.println("8s count  is ...." +c8 );
		System.out.println("9s count  is ...." +c9 );
		
		
		
	}

}
