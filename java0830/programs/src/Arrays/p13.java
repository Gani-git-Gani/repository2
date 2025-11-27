package Arrays;
//imp
//wapt find the duplicate elements in an array
public class p13 {

	public static void main(String[] args) {
		int[] a = {65,60,10,20,65,45,10,65,60};
		for (int i = a.length-1; i>=0 ; i--) 
		{
			boolean isDuplicate = false; 
			for (int j = i-1; j>=0; j--) {
				if (a[i]==a[j]) 
				{
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate) 
			{
				System.out.println(a[i]);
			}
		}
	}
}
