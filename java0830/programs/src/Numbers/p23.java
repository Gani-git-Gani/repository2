package Numbers;

import java.util.Scanner;

//wapt find wheather the number is spy number or not
public class p23 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		int temp=num;
		int sum=0;
		int prod=1;
		while (temp!=0)
		{
			int lastDigit=temp%10;
			temp/=10;
			sum+=lastDigit;
			prod*=lastDigit;
		}
		/*for (int i = 1; i <= num; i++)
		{
			if (num%i==0)
			{
				sum=sum+i;
				prod=prod*i;
			}
		}*/
		if (sum==prod)
		{
			System.out.println(num+" is spy number");
			
		}
		else 
		{
			System.out.println(num+" is not a spy number");
		}
	
	sc.close();
	}
}
