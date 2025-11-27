package Patterns;

/*
*
**
***
**
*

*/
public class p133 {
	public static void main(String[] args)
	{
		int row=5,  nochar = 1;
		for(int i=0;i<row;i++)
		{
			
			for(int k=0;k<nochar;k++)
			{
				System.out.print('*');
			}
			System.out.println();
			
			if (i<row/2)
			{
				nochar++;
			}
			else 
			{
				nochar--; 
			}
		}
	}

}