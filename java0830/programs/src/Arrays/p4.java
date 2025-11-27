package Arrays;

import java.util.Arrays;

//wap for bubble sort in increasing order
public class p4 {

	public static void bubbleSort(int[] a) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-i-1; j++) 
			{
				
				if(a[j]>a[j+1])
				{
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] x = {30,10,50,40,20};
		System.out.println(Arrays.toString(x));
		bubbleSort(x);
		System.out.println(Arrays.toString(x));
	}
}
