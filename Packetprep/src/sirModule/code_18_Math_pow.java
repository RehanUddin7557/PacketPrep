package sirModule;

public class code_18_Math_pow {

	public static void main(String[] args) 
	{
		//Double>long>int>short>byte
		///max we use int>long>float>double
		//10+(int)20.0 =30.0
		int t =(int) (10+(long)(float)(long)20.0);
		
		long num = 45892, r, res = 0, pIndex = 0, size = 0;

		// 98745 = 9*pow(10,4)+ 8*pow(10,3)+7* pow(10,2)+4 *pow(10,1)+5 * pow(10,0);
		// size = 5
		// index = size -1;
		// res = res +r * pow(10,index--);

		// 9*pow(10,0) + 8*pow(10,1) + 7*pow(10,2) + 4*pow(10,3) + 5*pow(10,4)

		// > 10 && < 99 == 2
		// >=100 && < 999 == 3
		// >=1000 && < 9999 == 4
		// >=10000 && < 99999 == 5

		if (num >= 10 && num <= 99)
			size = 2;
		else if (num >= 100 && num <= 999)
			size = 3;
		else if (num >= 1000 && num <= 9999)
			size = 4;
		else if (num >= 10000 && num <= 99999)
			size = 5;

		pIndex = size - 1;

		while (num > 0) {
			r = num % 10;
			res = res + r * (long) Math.pow(10, pIndex);
			num = num / 10;
			pIndex = pIndex - 1;

		}
		System.out.println("Result ......." + res);
  System.out.println(t
		  );
	}

}
