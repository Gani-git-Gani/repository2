package Patterns;
/*
55555
44444
33333
22222
11111

 */

public class p9 {

	public static void main(String[] args)
	{
		
		int row=5, col=5, num=5;
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				System.out.print(num);
			}
			System.out.println();
			num--;
		}
	}
}
