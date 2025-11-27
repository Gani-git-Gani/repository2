package Patterns;

/*
    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1

*/
public class p129 {
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