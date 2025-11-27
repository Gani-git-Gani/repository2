package Patterns;

/*
    1
   23
  456
 7891
23456

*/
public class p66 {
	public static void main(String[] args)
	{
		int num =1;
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if (i+j>=row-1) 
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