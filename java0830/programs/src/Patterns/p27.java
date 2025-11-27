package Patterns;

/*
5    
45   
345  
2345 
12345

*/
public class p27 {
	public static void main(String[] args)
	{
		
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			int num =5-i;
			for(int j=0;j<col;j++)
			{
				if (i>=j) 
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
