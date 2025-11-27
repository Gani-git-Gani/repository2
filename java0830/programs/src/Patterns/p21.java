package Patterns;

/*
A    
BB   
CCC  
DDDD 
EEEEE

*/
public class p21 {
	public static void main(String[] args)
	{
		char ch ='A';
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				if (i>=j) 
				{
					System.out.print(ch);
					
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.println();

			ch++;
		}
	}

}
