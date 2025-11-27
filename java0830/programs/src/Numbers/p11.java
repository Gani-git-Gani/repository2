package Numbers;


import java.util.Scanner;

//wap to check whether the num is prime or not
public class p11 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		if (isPrime(num)) {
			System.out.println(num+" is a prime no");
		} else {
			System.out.println(num+" is not a prime no");
		}
	}
		public static boolean isPrime(int num) 
		{
			boolean flag=true;
		for (int i = 2; i <=num/2; i++)
		{
			if (num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
		}
	
}

