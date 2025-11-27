package Patterns;

public class p4 {
	public static void main(String[] args)
	{
		int row=5, col=5;
		for(int i=0;i<row;i++)
		{
			char ch='E';
			for(int j=0;j<col;j++)
			{
				System.out.print(ch--);
			}
			System.out.println();
		}
	}

}
