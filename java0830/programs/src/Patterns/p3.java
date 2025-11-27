package Patterns;
/*
 12345
12345
12345
12345
12345
 */

public class p3 {
	public static void main(String[] args)
	{
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			int num=1;
			for(int j=0;j<col;j++)
			{
				System.out.print(num++);
			}
			System.out.println();
		}
	}

}
