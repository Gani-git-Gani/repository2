package Numbers;
//wap to print prime num from 1-1000
public class p12
{
	public static void main(String[] args) {
		for (int num = 0; num < 1000; num++) 
		{
			if (isPrime(num))
			{
				System.out.println(num);
			}
		}
	}
		public static boolean isPrime(int num) 
		{
			boolean flag=true;
		for (int i = 2; i <=num/2; i++)
		{
			if (num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
		}
	
}

