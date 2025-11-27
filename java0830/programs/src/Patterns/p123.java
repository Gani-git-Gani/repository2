package Patterns;

/*
   1
  222
 33333
4444444
 33333
  222
   1

*/
public class p123 {
	public static void main(String[] args)
	{
		int num = 1;
		int row=7, nospace = row/2, nochar = 1;
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
			
			if(i<row/2)
			{
				num++;
			nospace--;
			nochar+=2;
			}
			else
			{
				num--;
				nospace++;
				nochar-=2;
			}
		}
	}

}