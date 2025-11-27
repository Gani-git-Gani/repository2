package Numbers;

import java.util.Scanner;

//wapt display strong number/peterson number/krishnamurthi number
public class p21 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		int temp=num;
		int sum=0;
		while (temp!=0)
		{
			int lastdigit=temp%10;
			temp=temp/10; 
			int factorial=1;
			for (int i = lastdigit; i >= 1; i--)
			{
				factorial=factorial*i;
			}
			sum=sum+factorial;
		}
			if (num==sum)
			{
				System.out.println(num+" is Strong number");
				
			}
			else 
			{
				System.out.println(num+" is not a Strong number");
			}
		
		sc.close();	
	}
		
}
