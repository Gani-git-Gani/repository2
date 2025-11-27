package Patterns;

/*
  *
 **
***
 **
  *

*/
public class p134 {
	public static void main(String[] args)
	{
		int row=5, nospace = row/2,  nochar = 1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<nospace;j++)
			{
				System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print('*');
			}
			System.out.println();
			
			if (i<row/2)
			{
				nospace--;
				nochar++;
			}
			else 
			{
				nospace++;
				nochar--; 
			}
		}
	}

}