package Patterns;

/*
   A
  BBB
 CCCCC
DDDDDDD

*/
public class p89 {
	public static void main(String[] args)
	{
		char ch='A';
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
			ch++;
			nospace--;
			nochar+=2;
		}
	}

}