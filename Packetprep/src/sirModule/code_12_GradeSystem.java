package sirModule;

import java.util.Scanner;

public class code_12_GradeSystem {

	
	public static void main(String[] args) {
	
		System.out.println("Enter Marks :");
		Scanner s=new Scanner(System.in);
		int marks = s.nextInt();
		
		System.out.println("Entered Marks : " + marks);
	 	
	
		char grade = 'x';
		
		
		if(marks<25)
		{
				grade ='F';
		}
		
		else if(marks >= 25 && marks < 45)
		{
			grade ='E';	
		}

		
		else if(marks >= 45 && marks < 50)
		{
			grade ='D';	
		}
		
		else if(marks >= 50 && marks < 60)
		{
			grade ='C';	
		}
		else if(marks >= 60 && marks < 80)
		{
			grade ='B';	
			
		}
		else if(marks > 85)
		{
			grade ='A';	
		}
	
		System.out.println("Marks Grade Of Student is : " + grade);
		
	
	}

}
