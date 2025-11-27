package Patterns;

/*
AAAAA
BBBB 
CCC  
DD   
E    

*/
public class p75 {
	public static void main(String[] args)
	{
		char ch ='A';
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				if (i+j<=row-1) 
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
