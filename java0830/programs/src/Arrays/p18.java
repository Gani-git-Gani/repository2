package Arrays;

import java.util.Arrays;

//wapt left rotate the array by 2 times
public class p18
{
	public static void main(String[] args) 
	{
		int[] a = {70,60,10,20,30,45};
		int rotate = 2;
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < rotate; i++) 
		{
			int first = a[0];
			for (int j = 0; j < a.length-1; j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1] = first;
		}
		System.out.println(Arrays.toString(a));
	}
}
