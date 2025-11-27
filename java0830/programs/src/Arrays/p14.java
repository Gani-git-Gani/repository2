package Arrays;

import java.util.Arrays;

public class p14 {

	public static void main(String[] args)
	{
		int[] a= {65,60,10,10,65};
		System.out.println(Arrays.toString(a));
		int[] temp= new int[a.length];
		int k = a.length-1;
		for (int i = a.length-1; i >=0 ; i--)
		{
			boolean isDuplicate = false; 
			for (int j = i-1; j>=0; j--) 
			{
				if (a[i]==a[j]) 
				{
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) 
			{
				temp[k]=a[i];
				k--;
			}
		}
			a=new int[a.length-k-1];
			int n=0;
			for (int lv : temp)
			{
				if (lv!=0)
				{
					a[n]=lv;
					n++;
				}
			}
			System.out.println(Arrays.toString(a));
	}
}
