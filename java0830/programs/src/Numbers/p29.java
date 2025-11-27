package Numbers;

import java.util.Scanner;

//wapt check whether a number is sunny number
public class p29
{
	public static double squareRoot(double num) 
	{
		double sqrt =num/2;
		double temp=0;
		while (sqrt-temp !=0) 
		{
			temp =sqrt;
			sqrt=(temp+num/temp)/2;
		}
		return sqrt;
	}
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		double num= sc.nextDouble();
		if (squareRoot(num+1)%1==0) 
		{
			System.out.println(num+" is a sunny number");
		} 
		else 
		{
			System.out.println(num+" is not a sunny number");
		}
		sc.close();
	}
}
