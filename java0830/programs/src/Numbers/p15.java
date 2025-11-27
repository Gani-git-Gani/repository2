package Numbers;

//waptp the 1st 10 num in fibonocci series
public class p15
{
	public static void main(String[] args)
	{
		int x1 =0,x2=1;
		int count=10;
		int next_no;
		System.out.print(x1+","+x2);
		
		while (count-2>0) {
			next_no =x1+x2;
			System.out.print(","+next_no);
			x1=x2;
			x2=next_no;
			count--;
		}
	}
}	
	
