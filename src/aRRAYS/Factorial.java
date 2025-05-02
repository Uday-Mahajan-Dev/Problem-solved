package aRRAYS;
import java.util.*;
public class Factorial {
	
	public static int fact(int num)
	{	
		if( num == 0)
		{
			return 1;
		}
		return num*fact(num-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int num = sc.nextInt();
		int factorial = fact(num);
		
		System.out.println("Factorial od given number is "+factorial);
		
		
		
sc.close();
	}

}
