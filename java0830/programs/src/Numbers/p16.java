package Numbers;

import java.util.Scanner;

//waptp the 1st 10 num in fibonocci series using method recurssion
public class p16 {

	static int x1=0,x2=1;
	static int next_no;
	
	public static void fibonocci(int count)
	{
		
			next_no=x1+x2;
			System.out.print(","+next_no);
			count--;
			x1=x2;
			x2=next_no;
			if (count>0) {
			 fibonocci(count);
		}
		 
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int count= sc.nextInt();
		System.out.print(x1+","+x2);
		fibonocci(count-2);
	}
}
/*public static void main(String[] args) {
int count= 10;
System.out.print(x1+","+x2);
fibonocci(count-2);
}*/