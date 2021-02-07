package sirModule;

public class code_2_Array {

	public static void main(String[] args) {
		
		
		
		int[] num = {1,2,3,4,5,6}; /////num[0],num[1],num[2],num[3],num[4]
		int max =num[0];
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);
//		
		
		
		
		//method 1---for loop
		/*
		 * for(int index=0;index<5;index++) 
		 * { System.out.println(num[index]); //index =0 then 1 ,2 ,3 ,4 }
		 */
		
		//method 2---for loop
		//or
		//It takes the complete length of int[] num={10,23,78,3,7,3,4,5,6}
		
		/* for(int index=0; index<num.length;System.out.println(num[index++])); */
		
		
		////example 1---for loop finding Biggest number
		
		for(int index=1 ; index < num.length ; index++)
		{
			if(num[index]>max) {
				max=num[index];
			}
		}
		System.out.println("Biggest number.......   " + max);
		
	}

}
