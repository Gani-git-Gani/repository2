package Arrays;
//wapt find the sum of all the elements in array
public class p2 {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		int sum =0;
		for (int i = 0; i < a.length; i++) 
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
