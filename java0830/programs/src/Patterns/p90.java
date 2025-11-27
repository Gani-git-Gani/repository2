package Patterns;

/*
   D
  CCC
 BBBBB
AAAAAAA

*/
public class p90 {
	public static void main(String[] args)
	{
		char ch='D';
		int row=4, nospace = row-1, nochar = 1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print(ch);
				
			}
			System.out.println();
			ch--;
			nospace--;
			nochar+=2;
		}
	}

}