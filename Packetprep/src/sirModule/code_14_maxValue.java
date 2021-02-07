package sirModule;

public class code_14_maxValue {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		
		int max = a * ((a / b) > 0 ? 1 : 0) + b * ((b / a) > 0 ? 1 : 0);
		
		System.out.println("MaxValue is : " + max);
	}

}
