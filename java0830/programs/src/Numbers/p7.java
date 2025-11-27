package Numbers;

import java.util.Scanner;

/*wapt find the sum of all the digits in a number*/
public class p7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int sum =0;
		while (num!=0)
		{
			int lastdigit=num%10;
			num=num/10;
			sum+=lastdigit;
		}
		System.out.println("Sum="+sum);
	}

}
