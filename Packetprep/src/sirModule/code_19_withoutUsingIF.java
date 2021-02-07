package sirModule;

import java.util.Scanner;

public class code_19_withoutUsingIF {

	public static void main(String[] args) {
		
		
		
//		int a=30;
//		int b=20;

				System.out.println("Enter A value...");
				Scanner s = new Scanner(System.in);
				int a= s.nextInt();
				

				System.out.println("Enter A value...");
				Scanner s1 = new Scanner(System.in);
				int b= s1.nextInt();
				
				int max = a* ((a / b) > 0 ? 1: 0) + b * ((b/a) > 0? 1:0);
				
				System.out.println(" Big Value.."+max);
				
				
	}

}
