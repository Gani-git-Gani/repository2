package Arrays;

import java.util.Arrays;

//wap to copy the elements of one array into another array
public class p15 {

	public static void main(String[] args) 
	{
		int[] a = {70,60,10,20,30,45};
		System.out.println(Arrays.toString(a));
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
