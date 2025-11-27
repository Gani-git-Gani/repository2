package String;
//wapt print non duplicate characters in a string
public class p13 {

	public static void main(String[] args) {
		String s = "Deepika Padukone";
		char[] a = s.toCharArray();
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
			if (!isDuplicate) 
			{
				System.out.println(a[i]);
			}
		}
	}
}
