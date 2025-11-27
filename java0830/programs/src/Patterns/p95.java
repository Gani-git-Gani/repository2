package Patterns;

/*
   D
  DCD
 DCBCD
DCBABCD

*/
public class p95 {
	public static void main(String[] args)
	{
		
		int row=4, nospace = row-1, nochar = 1;
		for(int i=0;i<row;i++)
		{
			char ch='D';
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print(ch);
				if(k<nochar/2)
				{
				ch--;
				}
				else
				{
					ch++;
				}
			}
			System.out.println();
			
			nospace--;
			nochar+=2;
		}
	}

}