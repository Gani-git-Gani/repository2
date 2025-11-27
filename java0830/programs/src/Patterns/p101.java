package Patterns;

/*
   A
  CBA
 EDCBA
GFEDCBA
inverted of p97
*/
public class p101 {
	public static void main(String[] args)
	{
		
		int row=4, nospace = row-1, nochar = 1;
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
			
			nospace--;
			nochar+=2;
		}
	}

}