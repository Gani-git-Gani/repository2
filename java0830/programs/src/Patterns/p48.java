package Patterns;

/*
12345
 6789
  123
   45
    6

*/
public class p48 {
	public static void main(String[] args)
	{
		int num =1;
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if (i<=j) 
				{
					System.out.print(num++);
					if(num==10)
					{ 
						num=1;
					}
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}