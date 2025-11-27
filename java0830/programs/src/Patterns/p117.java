package Patterns;

/*
IHGFEDCBA
 GFEDCBA
  EDCBA
   CBA
    A
    
inverted of p111
*/
public class p117 {
	public static void main(String[] args)
	{
		
		int row=5, nospace = 0, nochar = 2*row-1;
		for(int i=0;i<row;i++)
		{
			char ch= (char)('A'+nochar-1);
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print(ch);
				ch--;
			}
			System.out.println();
			nospace++;
			nochar-=2;
			
		}
	}

}