package Arrays;

import java.util.Arrays;
//wap for selection sort in decreasing order
public class p7 {


	public static void selectionSort(int[] a) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			int maxIndex=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[j]>a[maxIndex]) 
				{
					maxIndex=j;
				}
			}
			if (maxIndex!=i)
			{
				int temp= a[maxIndex];
				a[maxIndex]=a[i];
				a[i]=temp;
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] x = {30,10,50,40,20};
		System.out.println(Arrays.toString(x));
		selectionSort(x);
		System.out.println(Arrays.toString(x));
	}
}
