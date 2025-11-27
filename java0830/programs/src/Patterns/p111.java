package Patterns;

/*
ABCDEFGHI
 ABCDEFG
  ABCDE
   ABC
    A

inverted of p92
*/
public class p111 {
	public static void main(String[] args)
	{
		
		int row=5, nospace = 0, nochar = 2*row-1;
		for(int i=0;i<row;i++)
		{
			char ch='A';
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
			nospace++;
			nochar-=2;
			;
		}
	}

}