package Patterns;

/*
101010101
 0101010
  10101
   010
    1

inverted of p104
*/
public class p119 {
	public static void main(String[] args)
	{
		
		int row=5, nospace = 0, nochar = row*2-1;
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
			
			nospace++;
			nochar-=2;
		}
	}

}