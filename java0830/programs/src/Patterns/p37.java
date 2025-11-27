package Patterns;

/*
12345
 1234
  123
   12
    1
*/
public class p37 {
	public static void main(String[] args)
	{
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			int num=1;
			for(int j=0;j<col;j++)
			{
				if (i<=j) 
				{
					System.out.print(num++);
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
