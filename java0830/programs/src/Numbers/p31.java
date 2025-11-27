package Numbers;

import java.util.Scanner;

//waptc whether a number is fascinating number
public class p31 {
	
	public static int noofDigits(int num)
	{
		int digits=0;
		while (num !=0)
		{
			digits++;
			num/=10;
		}
		return digits;
	}
	
	public static boolean isFascinatingNo(int num) 
	{
		String s=""+num+2*num+3*num;
		boolean flag=true;
		for (char ch = '1'; ch <= '9'; ch++)
		{
			int count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if (s.charAt(j)==ch)
				{
					count++;
				}
			}
			if (count!=1)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		if (noofDigits(num)>=3)
		{
			if (isFascinatingNo(num))
			{
				System.out.println(num+"is a fascinating number");
			} 
			else
			{
				System.out.println(num+"is not a fascinating number");
			}
		} 
		else
		{
			System.out.println(num+"does not have sufficient digits");
		}
		sc.close();
	}
}
