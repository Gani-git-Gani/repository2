package Patterns;

/*
*    *
**  **
******
**  **
*    *

*/
public class p143 {
	public static void main(String[] args)
	{
		int row=7, nospace = 0, nochar = 7;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
					
			}
			for(int k=0;k<nochar;k++)
			{
				if (i==0||i==row-1||k==0||k==nochar-1)
				{
					System.out.print('*');
				} 
				else
				{
					System.out.print(' ');
				}
			}
			
			System.out.println();
			if(i<row/2)
			{
			nospace-=2;
			nochar++;
			}
			else
			{
				nospace+=2;
				nochar--;
			}
		}
	}

}