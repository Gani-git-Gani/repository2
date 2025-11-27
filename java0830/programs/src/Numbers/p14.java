package Numbers;

import java.util.Scanner;

public class p14 {
	
	
	public static int factorial(int num)
	{
		if (num==1) {
			return 1;
		} else {
			return num*factorial(num-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		System.out.println(factorial(num));
	}
}
