package Patterns;

/*
   1
  321
 54321
7654321
inverted of p98
*/
public class p102 {
	public static void main(String[] args)
	{
		
		int row=4, nospace = row-1, nochar = 1;
		for(int i=0;i<row;i++)
		{
			int num= 1+nochar-1;
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print(num);
				
					num--;
			}
			System.out.println();
			
			nospace--;
			nochar+=2;
		}
	}

}