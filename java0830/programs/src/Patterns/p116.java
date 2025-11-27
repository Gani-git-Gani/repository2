package Patterns;

/*
ABCDEABCD
 ABCDABC
  ABCAB
   ABA
    A
*/
public class p116 {
	public static void main(String[] args)
	{
		
		int row=5, nospace = 0, nochar = row;
		for(int i=0;i<row;i++)
		{
			char ch='A';
			for(int j=0;j<nospace;j++)
			{
					System.out.print(' ');
					
			}
			for(int k=0;k<nochar;k++)
			{
				System.out.print(ch);
				ch++;	
			}
			ch = 'A';
            for (int l = 0; l < nochar - 1; l++) {
                System.out.print(ch);
                ch++;
            }
			System.out.println();
			nospace++;
			nochar--;
			
		}
	}

}