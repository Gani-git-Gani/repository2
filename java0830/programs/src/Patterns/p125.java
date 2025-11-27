package Patterns;

/*
    5
   444
  33333
 2222222
111111111
 2222222
  33333
   444
    5

*/
public class p125 {
	public static void main(String[] args)
	{
		int num = 5;
		int row=9, nospace = row/2, nochar = 1;
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
				num--;
			nospace--;
			nochar+=2;
			}
			else
			{
				num++;
				nospace++;
				nochar-=2;
			}
		}
	}

}