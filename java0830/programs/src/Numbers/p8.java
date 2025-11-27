package Numbers;

import java.util.Scanner;

/*wapt find the product of all the digits in a number*/
public class p8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int prod =1;
		while (num!=0)
		{
			int lastdigit=num%10;
			num=num/10;
			prod*=lastdigit;
		}
		System.out.println("Product="+prod);
	}

}
