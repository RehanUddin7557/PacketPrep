package sirModule;

public class code_8_ComplexSwitchInToElseIF {
	//find count of each digit of a given num
public static void main(String[] args) 
{
	long num=111334,t;
			int r;// 
//			int c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
//			int c[]= {0,0,0,0,0,0,0,0,0,0};
			
			int c[] = new int[10];
			for(int index=0;index<=9;index++) {
				c[index] = 0;
			}
			t=num;
			while(num > 0) 
			{
				r = (int)num % 10;//111334 % 10===4
				
				if(r == 0)      c[0]++;
				
				else if(r == 1) c[1]++;
				else if(r == 2) c[2]++;
				else if(r == 3) c[3]++;
				else if(r == 4) c[4]++;
				else if(r == 5) c[5]++;
				else if(r == 6) c[6]++;
				else if(r == 7) c[7]++;
				else if(r == 8) c[8]++;
				else if(r == 9) c[9]++;
			
				switch(r)
				{
				case 0: c[0]++;
				break;
				case 1: c[1]++;
				break;
				case 2: c[2]++;
				break;
				case 3: c[3]++;
				break;
				case 4: c[4]++;
				break;
				case 5: c[5]++;
				break;
				case 6: c[6]++;
				break;
				case 7: c[7]++;
				break;
				case 8: c[8]++;
				break;
				case 9: c[9]++;
				break;
				}
				num= num / 10;
			}
	
			System.out.println("Given number....."+ t);
			for(int index=0; index<=9; index++)
			{
				
				if(c[index]==0) {
					System.out.println("missing Number...." +index);
				}
//			System.out.println(index+"s counts..... "+  c[index]);	
			}
			}
}
