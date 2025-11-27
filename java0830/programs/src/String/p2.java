package String;
//wapt reverse a string
public class p2 {

	public static void main(String[] args)
	{
		
	String s="Disha";
	String reverse = "";
	char[] ch = s.toCharArray();
	for (int i = ch.length-1; i >=0 ; i--)
	{
		reverse=reverse+ch[i];
	}
	System.out.println(reverse);
	}
}
