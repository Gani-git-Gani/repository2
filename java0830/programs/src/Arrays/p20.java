package Arrays;

public class p20 {

	public static void linearsearch(int[] a, int key)
	{
		boolean flag= false;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]==key)
			{
				flag=true;
				break;
			}
		}
			if (flag)
			{
				System.out.println(key+" is present in the array");
			} 
			else
			{
				System.out.println(key+" is not present in the array");
			}
	}
	public static void main(String[] args) {
		int[] a = {70,60,10,20,30,45};
		linearsearch(a,30);
	}
}
