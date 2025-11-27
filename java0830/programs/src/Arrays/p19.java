package Arrays;

import java.util.Arrays;

//wapt right rotate the array by 2 times
public class p19 {

	public static void main(String[] args) 
	{
		int[] a = {70,60,10,20,30,45};
		int rotate = 2;
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < rotate; i++) 
		{
			int last = a[a.length-1];
			for (int j = a.length-1; j > 0; j--)
			{
				a[j]=a[j-1];
			}
			a[0] = last;
		}
		System.out.println(Arrays.toString(a));
	}
}
