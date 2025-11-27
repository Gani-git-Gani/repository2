package String;
//wapt find length of the string data without using inbuilt function length
public class p9 {

	public static void main(String[] args) {
		
		String s ="Java";
		char[] ch = s.toCharArray(); 
		int length=0;
		for (char c : ch) 
		{
			length++;
		}
		System.out.println(length);
	}
}
