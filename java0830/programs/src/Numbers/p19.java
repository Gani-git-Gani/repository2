package Numbers;

import java.util.Scanner;

//wapt check whether a num is armstrong num
public class p19 {

	public static int noofDigits(int num) {
		int digits =0;
		while (num!=0) {
			digits++;
			num/=10;
		}
		return digits;
	}
	
	public static void isArmstrongNumber(int num) {
		int digits=noofDigits(num);
		int temp=num;
		int sum=0;
		while (temp!=0) {
			int power=1;
			int lastDigit = temp%10;
			for (int i = 0; i < digits; i++) {
				power=power*lastDigit;
			}
			sum=sum+power;
			temp=temp/10;
		}
		if (sum==num) {
			System.out.println(num+" is a Armstrong Number");
		} else {
			System.out.println(num+" is not a Armstrong Number");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		isArmstrongNumber(num);
		sc.close();
	}	
}
