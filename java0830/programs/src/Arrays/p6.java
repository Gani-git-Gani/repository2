package Arrays;

import java.util.Arrays;

//wap for selection sort in increasing order
public class p6 {

	public static void selectionSort(int[] a) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			int minIndex=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[j]<a[minIndex]) 
				{
					minIndex=j;
				}
			}
			if (minIndex!=i)
			{
				int temp= a[minIndex];
				a[minIndex]=a[i];
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
