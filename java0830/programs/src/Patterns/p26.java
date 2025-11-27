package Patterns;

/*
A    
BA   
CBA  
DCBA 
EDCBA

*/
public class p26 {
	public static void main(String[] args)
	{
		
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			char ch =(char)('A'+i);
			for(int j=0;j<col;j++)
			{
				if (i>=j) 
				{
					System.out.print(ch--);
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