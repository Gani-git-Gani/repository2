package Numbers;

import java.util.Scanner;

/*wapt no of digits in a no*/
public class p6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int digits=0;
		while (num!=0)
		{
			num/=10;
			digits++;
		}
		System.out.println(digits);
	}
}
