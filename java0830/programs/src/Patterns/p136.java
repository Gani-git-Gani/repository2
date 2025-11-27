package Patterns; //07/07/2025
/* Pattern 136
*****
 ***
  *
 ***
*****
*/

public class p136{
	public static void main(String[] args) {
		int row= 5; 
		int nochar =5; 
		int nospace= 0;
		for(int i=0; i<row; i++) 
		{ 
			for (int j=0; j<nospace; j++)
			{
				System.out.print(' ');
			}
			for(int k=0; k<nochar; k++)
			{
				System.out.print('*'); 
				
			}
			System.out.println();
			if(i<row/2) 
			{
				nospace++;
				nochar-=2;
			}
			else
			{
				nospace--;
				nochar+=2; 
			}
		}
	}

}
