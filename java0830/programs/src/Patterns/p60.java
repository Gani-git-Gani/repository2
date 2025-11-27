package Patterns;

/*
    5
   44
  333
 2222
11111


*/
public class p60 {
	public static void main(String[] args)
	{
		int num = 5;
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				if (i+j>=row-1) 
				{
					System.out.print(num);
					
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.println();

			num--;
		}
	}

}
