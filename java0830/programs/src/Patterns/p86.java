package Patterns;

/*
10101
1010 
101  
10   
1    

*/
public class p86 {
	public static void main(String[] args)
	{
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if (i+j<=row-1) 
				{
					System.out.print((j+1)%2);
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