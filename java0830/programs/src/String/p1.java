package String;
//wap to count the no of characters in a String
public class p1 {

	public static void main(String[] args) {
		String s = "Java Is Easy";
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]!=' ')
			{
				count++;
			}
		}
		System.out.println("the no of characters in String is "+count);
	}
}
