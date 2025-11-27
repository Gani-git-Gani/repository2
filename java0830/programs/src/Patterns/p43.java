package Patterns;

/*
EDCBA
 EDCB
  EDC
   ED
    E


*/
public class p43 {
	public static void main(String[] args)
	{
		
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				char ch =(char)('E'+i-j);
				if (i<=j) 
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
