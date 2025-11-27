package Patterns;

/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
 ABCDCBA
  ABCBA
   ABA
    A

*/
public class p126 {
	public static void main(String[] args)
	{
		
		int row=9, nospace = row/2, nochar = 1;
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
				if(k<nochar/2)
				{
					ch++;
				}
				else
				{
					ch--;
				}
			}
			System.out.println();
			
			if(i<row/2)
			{
				
			nospace--;
			nochar+=2;
			}
			else
			{
				
				nospace++;
				nochar-=2;
			}
		}
	}

}