package Patterns;

/*
   1
  222
 33333
4444444

*/
public class p91 {
	public static void main(String[] args)
	{
		int num=1;
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
			num++;
			nospace--;
			nochar+=2;
		}
	}

}