package Numbers;

import java.util.Scanner;

public class p30 
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int year= sc.nextInt();
		if (year%4==0)
		{
			if(year%100==0&&year%400!=0) 
			{
			System.out.println("it is not a leap year");
			}
			else
			{
			System.out.println("it is a leap year");
			}
		}
		sc.close();
	}
}
