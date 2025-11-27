package Arrays;

import java.util.Arrays;

//wapt reverse an array
public class p1 {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		for (int i = 0; i < a.length/2; i++)
		{
			a[i] = a[i] + a[a.length-i-1];
			a[a.length-i-1] = a[i] - a[a.length-i-1];
			a[i] = a[i] - a[a.length-i-1];
		}
		System.out.println(Arrays.toString(a));
	}
}
