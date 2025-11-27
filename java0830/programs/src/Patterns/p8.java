package Patterns;
/*
EEEEE
DDDDD
CCCCC
BBBBB
AAAAA


 */

public class p8 {
	public static void main(String[] args)
	{
		char ch='E';
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
			ch--;
		}
	}

}
