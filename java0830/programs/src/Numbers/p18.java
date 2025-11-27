package Numbers;

import java.util.Scanner;

public class p18 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		int temp=num;
		int sqr=num*num;
		boolean flag=true;
		while (temp!=0)
		{
			if (temp%20!=sqr%10)
			{
				flag=false;
				break;
			}
			temp=temp/10;
			sqr=sqr/10;
		}
		if (flag) {
			System.out.println("Automorphic Number");
		} else {
			System.out.println("Not an Automorphic Number");
		}
	}
}
