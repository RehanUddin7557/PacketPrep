package sirModule;

public class code_1_Method {
	
	static class student{
		int sno;
		String name;
		
		static String country ="Indian"; 
		
		//method-1    
		//void---->no returnType  
		//If we use static we can directly call it in main class without creating an object
	static void m1() {
			System.out.println("From method m1");
		}
		
		
		
	}
	
	

	public static void main(String[] args) {
	
//object creation		
		student s1 = new student();
		student s2 = new student();
//assigning values using object reference
	String a  = s1.name="Yass";
	String b  =	s2.name="Rehan";
		
	System.out.println("S1 STUDENT NAME IS : " + a + "  she is "+ s1.country);	
		
	System.out.println("S2 STUDENT NAME IS : " + b + "  he is "+ s2.country);	
	
		
		
		student.m1();

	}

}
