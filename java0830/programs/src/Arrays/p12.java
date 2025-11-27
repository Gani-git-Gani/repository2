package Arrays;

import java.util.Arrays;

//wapt find largest,secondlargest and least number in an array
public class p12 {

	public static void main(String[] args) {
		int[] a = {70,60,10,20,30,45};
		Arrays.sort(a);//use bubble sort 
		System.out.println(a[a.length-1]);
		System.out.println(a[a.length-2]);
		System.out.println(a[0]);
	}
}
