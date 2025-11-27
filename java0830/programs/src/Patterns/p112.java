package Patterns;

/*
123456789
 1234567
  12345
   123
    1

inverted of p
*/
public class p112 {
	public static void main(String[] args)
	{
		
		int row=5, nospace = 0, nochar = 2*row-1;
		for(int i=0;i<row;i++)
		{
			int num=1;
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
			nospace++;
			nochar-=2;
			;
		}
	}

}