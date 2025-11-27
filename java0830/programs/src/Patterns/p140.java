package Patterns;

/*
     *
    * *
   *   *
  *     *
 *       *
***********
   
*/
public class p140 {
	public static void main(String[] args)
	{
		int row=6, nospace = row-1, nochar = 1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				if (i==row-1||k==0||k==nochar-1)
				{
					System.out.print('*');
				} 
				else
				{
					System.out.print(' ');
				}
			}
			System.out.println();
			nospace--;
			nochar+=2;
		}
	}

}