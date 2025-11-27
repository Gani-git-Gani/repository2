package Patterns;

/*
55555
4444 
333  
22   
1    

*/
public class p78 {
	public static void main(String[] args)
	{
		int num = 5;
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				if (i+j<=row-1) 
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
