package Numbers;

import java.util.Scanner;

/*check whether there are even no digits(9801)
 * divide 1st 2 and last 2(98|01)
 * add them (98+01)
 * square the sum 99^2=9801
 * possible numbers 2025,3025,9801
 */
public class p28 {

	public static int digits =0;
	public static int noofDigits(int num)
	{	
		while (num!=0) {
			digits++;
			num/=10;
		}
		return digits;
	}
	public static boolean isTechno(int num)
	{
		boolean flag=false;
		int digits =noofDigits(num);
		int divisor=1;
		for (int i = 0; i < digits/2; i++) 
		{
			divisor=divisor*10;
		}
			int secondhalf= num%divisor;
			int firstHalf= num/divisor;
			int square=(firstHalf+secondhalf)*(firstHalf+secondhalf);
			if(num==square)
			{
				flag=true;
			}
			return flag;
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		if (digits%2==0) {
			if (isTechno(num)) 
			{
				System.out.println(num+" is a Tech number");
			} 
			else 
			{
				System.out.println(num+" is not a Tech number");
			}
			
		}
		else
		{
			System.out.println(num+"does not contain even no of digita");
		}
		sc.close();
	}
}
