package Patterns;

/*
54321
 5432
  543
   54
    5

*/
public class p45 {
	public static void main(String[] args)
	{
		
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			int num =5;
			for(int j=0;j<col;j++)
			{
				if (i<=j) 
				{
					System.out.print(num--);
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
