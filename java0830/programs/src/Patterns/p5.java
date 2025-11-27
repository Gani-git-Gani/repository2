package Patterns;
/*
54321
54321
54321
54321
54321
 */

public class p5 {
	public static void main(String[] args)
	{
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			int num=5;
			for(int j=0;j<col;j++)
			{
				System.out.print(num--);
			}
			System.out.println();
		}
	}

}
