package Patterns;

/*
101010101
 1010101
  10101
   101
    1
inverted of p103
*/
public class p118 {
	public static void main(String[] args)
	{
		
		int row=5, nospace = 0, nochar = row*2-1;
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
			
			nospace++;
			nochar-=2;
		}
	}

}