package Patterns;

/*
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1

*/
public class p127 {
	public static void main(String[] args)
	{
		
		int row=9, nospace = row/2, nochar = 1;
		for(int i=0;i<row;i++)
		{
			int num = 1;
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print(num);
				if(k<nochar/2)
				{
					num++;
				}
				else
				{
					num--;
				}
			}
			System.out.println();
			
			if(i<row/2)
			{
				num++;
			nospace--;
			nochar+=2;
			}
			else
			{
				num--;
				nospace++;
				nochar-=2;
			}
		}
	}

}