package Patterns;

/*
   1
  123
 12345
1234567

*/
public class p98 {
	public static void main(String[] args)
	{
		
		int row=4, nospace = row-1, nochar = 1;
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
			
			nospace--;
			nochar+=2;
		}
	}

}