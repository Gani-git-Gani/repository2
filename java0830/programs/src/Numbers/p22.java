package Numbers;

import java.util.Scanner;

public class p22 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		int sum=0;
		for (int i = 1; i <= num/2; i++)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		}
		if (num==sum)
		{
			System.out.println(num+" is perfect number");
			
		}
		else 
		{
			System.out.println(num+" is not a perfect number");
		}
	
	sc.close();
	}
}
