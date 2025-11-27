package String;
//string palindrome
public class p3 {

	public static void main(String[] args)
	{
		
	String s="AMMA";
	String reverse = "";
	char[] ch = s.toCharArray();
	for (int i = ch.length-1; i >=0 ; i--)
	{
		reverse=reverse+ch[i];
	}
	if (s.contentEquals(reverse)) {
		System.out.println("palindrome");
	} else {
		System.out.println("not palindrome");
	}
	}
}
