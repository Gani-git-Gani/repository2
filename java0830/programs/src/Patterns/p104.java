package Patterns;

/*
   1
  010
 10101
0101010
similar to p85
*/
public class p104 {
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
				System.out.print((i+k+1)%2);
				
					
			}
			System.out.println();
			
			nospace--;
			nochar+=2;
		}
	}

}