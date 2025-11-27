package Patterns;

/*
    E
   DDD
  CCCCC
 BBBBBBB
AAAAAAAAA
 BBBBBBB
  CCCCC
   DDD
    E

*/
public class p124 {
	public static void main(String[] args)
	{
		char ch='E';
		int row=9, nospace = row/2, nochar = 1;
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
			
			if(i<row/2)
			{
				ch--;
			nospace--;
			nochar+=2;
			}
			else
			{
				ch++;
				nospace++;
				nochar-=2;
			}
		}
	}

}