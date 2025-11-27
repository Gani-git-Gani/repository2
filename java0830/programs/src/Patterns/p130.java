package Patterns;

/*
    1
   101
  10101
 1010101
101010101
 1010101
  10101
   101
    1

*/
public class p130 {
	public static void main(String[] args)
	{
		
		int row=9, nospace = row/2, nochar = 1;
		for(int i=0;i<row;i++)
		{
			int num = 1 + nochar/2;
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print((k+1)%2);
				
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