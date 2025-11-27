package String;

import java.util.LinkedHashSet;

//wapt print non duplicate characters in a string using collection
public class p14 {

	public static void main(String[] args) {
		String s = "Deepika Padukone";
		s=s.toLowerCase();
		char[] ch = s.toCharArray();
		LinkedHashSet l = new LinkedHashSet();
		for (int i = 0; i < ch.length; i++) {
			if (!l.add(ch[i])) 
			{
				System.out.println(ch[i]);
			}
		}
	}
}
