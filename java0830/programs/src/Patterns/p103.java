package Patterns;

/*
   1
  101
 10101
1010101
simiar to p86
*/
public class p103 {
	public static void main(String[] args)
	{
		
		int row=4, nospace = row-1, nochar = 1;
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print((k+1)%2);
				
					
			}
			System.out.println();
			
			nospace--;
			nochar+=2;
		}
	}

}