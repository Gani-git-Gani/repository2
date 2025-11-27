package Numbers;

import java.util.Scanner;

public class p20 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		int sqr=num*num;
		int sum=0;
		while(sqr !=0)
		{
			sum= sum+sqr%10;
			sqr/=10;
		}
		if (num==sum)
		{
			System.out.println(num+" is neon number");
			
		}
		else 
		{
			System.out.println(num+" is not a neon number");
		}
		sc.close();
	}	
}
