package Patterns;

/*
   4
  333
 22222
1111111

*/
public class p92 {
	public static void main(String[] args)
	{
		int num=4;
		int row=4, nospace = row-1, nochar = 1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print(num);
				
			}
			System.out.println();
			num--;
			nospace--;
			nochar+=2;
		}
	}

}