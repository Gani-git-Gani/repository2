package Patterns;

/*
543212345
 4321234
  32123
   212
    1

*/
public class p115 {
	public static void main(String[] args)
	{
		
		int row=5, nospace = 0, nochar = 2*row-1;
		for(int i=0;i<row;i++)
		{
			int num = 1+row-1;
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
					num--;
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
			nospace++;
			nochar-=2;
			
		}
	}

}