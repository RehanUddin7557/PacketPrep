package sirModule;

import java.util.Scanner;

public class code_13_BigValueCheckUsingScanner {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a Value of A : ");
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		
		System.out.println("Enter a Value of B : ");
		int b =s.nextInt();
		
		
		System.out.println("Enter a Value of C : ");
		int c =s.nextInt();
		
	//**************************************** Ternary Operator	******************************************
//	condition ? true:false;
		
////1)       int big = (a > b)? a:b;
//		System.out.println("BIG value is : " + big);
		
		
	////2)		int big = a > b ? (a > c ? a:c):(b>c? b:c);
	//			System.out.println("BIG value is : " + big);
		
	int big = (a > b) && (a > c) ? a : ((b > a) && (b > c) ? b : c);
		
		
		
			System.out.println("BIG value is : " + big);
		

	}

}


