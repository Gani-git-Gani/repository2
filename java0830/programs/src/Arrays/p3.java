package Arrays;
//wapt find the sum of all the elements in array
public class p3 {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		int prod =1;
		for (int i = 0; i < a.length; i++) 
		{
			prod*=a[i];
		}
		System.out.println(prod);
	}
}
