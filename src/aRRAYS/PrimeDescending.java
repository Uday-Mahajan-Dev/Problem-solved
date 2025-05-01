package aRRAYS;

public class PrimeDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		boolean isPrime = true;
		for(i=999; i>99; i--)
		{
			for( j=i-1; j>99; j--)
			{
				if(j%i == 0)
				{
					isPrime = false;
					break;
				}
			}
			}
		if(isPrime)
		{
			System.out.println(i);
		}
		}

	

}
