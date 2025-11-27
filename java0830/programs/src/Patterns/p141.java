package Patterns;

/*
*******
 *   *
  * *
   *
    
*/
public class p141 {
	public static void main(String[] args)
	{
		int row=5, nospace = 0, nochar = row+2;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				if (i==0||k==0||k==nochar-1)
				{
					System.out.print('*');
				} 
				else
				{
					System.out.print(' ');
				}
			}
			System.out.println();
			nospace++;
			nochar-=2;
		}
	}

}