package Patterns;

/*
   4
  434
 43234
4321234

*/
public class p96 {
	public static void main(String[] args)
	{
		
		int row=4, nospace = row-1, nochar = 1;
		for(int i=0;i<row;i++)
		{
			int num=4;
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print(num);
				if(k<nochar/2)
				{
					num--;
				}
				else
				{
					num++;
				}
			}
			System.out.println();
			
			nospace--;
			nochar+=2;
		}
	}

}