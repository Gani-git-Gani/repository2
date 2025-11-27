package Patterns;

/*
    1
   010
  10101
 0101010
101010101
 0101010
  10101
   010
    1

*/
public class p132 {
	public static void main(String[] args)
	{
		
		int row=9, nospace = row/2, nochar = 1;
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print((i+k+1)%2);
				
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