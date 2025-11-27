package Patterns;
/*
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE

 */


public class p6 {

	public static void main(String[] args)
	{
		char ch='A';
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}
	}
}
