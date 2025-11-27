package Patterns;

/*
54321
4321 
321  
21   
1    

*/
public class p81 {
	public static void main(String[] args)
	{
		
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			int num =5-i;
			for(int j=0;j<col;j++)
			{
				if (i+j<=row-1) 
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
