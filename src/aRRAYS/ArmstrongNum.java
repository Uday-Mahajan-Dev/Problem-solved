package aRRAYS;
import java.util.*;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, originalNum, remainder, result=0 ;
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		if(num < 99 || num > 999)
		{
			System.out.println("Enter a 3 digit number");
		}
		originalNum = num;
				
		while(originalNum != 0)
		{
			remainder = originalNum % 10;
			result += Math.pow(remainder, 3);
			originalNum /= 10;
		}
		if(result == num)
		{
			System.out.println("Armstrong number = True");
		}
		else {
			System.out.println("Armstrong number = False");
		}
		sc.close();
	}

}
