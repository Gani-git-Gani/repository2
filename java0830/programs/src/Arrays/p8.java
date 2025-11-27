package Arrays;

import java.util.Arrays;

//wap for insertion sort in the increasing order
public class p8 {

	public static void insertionSort(int[] a)
	{
		for (int i = 1; i < a.length; i++) 
		{
			int temp=a[i];
			int j=i-1;
			while (j>=0&&temp<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
	public static void main(String[] args)
	{
		int[] x = {40,30,10,50,20};
		System.out.println(Arrays.toString(x));
		insertionSort(x);
		System.out.println(Arrays.toString(x));
	}
}
