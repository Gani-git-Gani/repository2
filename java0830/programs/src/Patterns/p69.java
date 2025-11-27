package Patterns;

/*
    1
   00
  111
 0000
11111

*/
public class p69 {
	public static void main(String[] args)
	{
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if (i+j>=row-1) 
				{
					System.out.print((i+1)%2);
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}