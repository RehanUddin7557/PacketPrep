package sirModule;

public class code_20_Add2ToDIGITS {


	public static void main(String[] args) {
				//Take a 4 digit number. Write a program to display a number whose digits are 
				//2 greater than the corresponding digits of the number TAKEN.
				//For example, if the number which was taken is 5696, then the displayed number 
				//should be 7818.	
		
		//rRes =remainderResult
		
				int num = 5696,r,res=0,rRes,pIndex=0;
				
				while(num > 0) 
				{
					r = num % 10;//6
					
					if(r == 9) rRes = 1;
					 else if(r == 8) rRes = 0;
					      
					  else rRes = r + 2;
					
					res = res +(int) Math.pow(10, pIndex) * rRes;
					num = num / 10;
					pIndex = pIndex +1 ;
					
				}
				System.out.println("result is ...." +res);
		
	}


}
/////iske baad try this one

/*
 * int num = 5696,r,res=0,rRes,pIndex=0,p=1;
 * 
 * while(num > 0) { r = num % 10;//6
 * 
 * if(r == 9) rRes = 1; else if(r == 8) rRes = 0; else rRes = r + 2;
 * 
 * //res = res +(int) Math.pow(10, pIndex) * rRes; res = res + p * rRes; num =
 * num / 10; p=p*10; }
 * 
 * System.out.println("result is ...." +res);
 * 
 * }
 */