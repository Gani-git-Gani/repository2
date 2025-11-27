package Patterns;

/*
EEEEEEEEE
 DDDDDDD
  CCCCC
   BBB
    A

*/
public class p109 {
	public static void main(String[] args)
	{
		char ch='E';
		int row=5, nospace = 0, nochar = 2*row-1;
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
			nospace++;
			nochar-=2;
			ch--;
		}
	}

}