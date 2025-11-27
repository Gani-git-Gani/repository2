package String;
//wapt reverse a sentence
public class p5 {

	public static void main(String[] args) {
		String s = "Abhi Is Handsome";
		String reverse ="";
		String[] x = s.split(" ");
		for (int i = x.length-1; i >= 0 ; i--)
		{
			reverse = reverse + x[i] + " ";
		}
		System.out.println(reverse);
	}
}
