package Arrays;
//wapt find second largest element in an array
public class p11 {

	public static void main(String[] args) {
		int[] a = {70,60,10,20,30,45};
		int largest= 0;
		int secondlargest = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>largest)
			{
				secondlargest = largest;
				largest=a[i];
			} 
			else if (a[i]!= largest && a[i]>secondlargest)//will not return duplicate value
										//else if (a[i]>secondlargest)return duplicate value 
			{
				secondlargest=a[i];
			}
		}
		System.out.println("Largest = "+largest);
		System.out.println("SecondLargest = "+secondlargest);
	}
}
