package Patterns;

/*
****
 ****
  ****
   ****

*/
public class p138 {
	public static void main(String[] args)
	{
		int row=4, nospace = 0, nochar = 4;
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
				nospace++;
			
		}
	}

}