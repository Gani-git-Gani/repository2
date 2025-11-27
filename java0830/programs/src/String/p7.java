package String;
//wapt find the longest word in a sentence
public class p7 {

	public static void main(String[] args) {
		String s = "Arnold is the best bodybuilder";
		String[] x = s.split(" ");
		String longest="";
		for (int i = 0; i < x.length; i++) {
			if (x[i].length() > longest.length())
			{
				longest = x[i];
			}
		}
		System.out.println("the longest word in a sentence is "+longest);
	}
}
