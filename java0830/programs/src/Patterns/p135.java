package Patterns;

/*
 
*    *
**  **
******
**  **
*    *

*/
public class p135 {
	public static void main(String[] args)
	{
		int row=5, nospace = row-1, nochar = 2;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<nochar/2;j++)
			{
					System.out.print('*');
					
			}
			for(int k=0;k<nospace;k++)
			{
				System.out.print(' ');
			}
			for(int l=0;l<nochar/2;l++)
			{
					System.out.print('*');
			}
			System.out.println();
			if(i<row/2)
			{
			nospace-=2;
			nochar+=2;
			}
			else
			{
				nospace+=2;
				nochar-=2;
			}
		}
	}

}