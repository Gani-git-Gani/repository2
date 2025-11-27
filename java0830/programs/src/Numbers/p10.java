package Numbers;

import java.util.Scanner;

public class p10 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		int temp=num,reverse=0,ld;
		while(temp!=0)
		{
			ld=temp%10;
			temp=temp/10;
			reverse=reverse*10+ld;
		}
		if (num==reverse) {
			System.out.println(num+"is a palindrome");
		} else {
			System.out.println(num+"is not a palindrome");
		}
	}
}
