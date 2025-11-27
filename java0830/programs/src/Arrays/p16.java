package Arrays;
//wapt find the frequency of the elements
public class p16 {

	public static void main(String[] args) 
	{
		int[] a = {10,40,30,10,20,30,10,40,50};
		int[] frequency = new int[a.length];
		int visited = -1;
		for (int i = 0; i < a.length; i++) 
		{
			int count = 1;
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]==a[j])
				{
					count++;
					frequency[j] = visited;
				}
			}
			if (frequency[i] != visited)
			{
				frequency[i] = count;
				
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			if (frequency[i]!=visited)
			{
				System.out.println(a[i]+"="+frequency[i]);
			}
		}
	}
}