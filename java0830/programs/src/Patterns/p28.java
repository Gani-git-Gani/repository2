package Patterns;

/*
1    
21   
321  
4321 
54321

*/
public class p28 {
	public static void main(String[] args)
	{
		
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			int num =1+i;
			for(int j=0;j<col;j++)
			{
				if (i>=j) 
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
