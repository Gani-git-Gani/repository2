package String;
//WAPT reverse a string using method recurssion
public class P11 {

	public static String reverse(String x) 
	{
		if (x.length()==1)
		{
			return x;
		} 
		else
		{
			return x.charAt(x.length()-1)+reverse(x.substring(0, x.length()-1));
		}
	}
	public static void main(String[] args) {
		String s ="java";
		System.out.println(reverse(s));
	}
}
