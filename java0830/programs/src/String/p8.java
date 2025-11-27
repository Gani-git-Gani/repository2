package String;
//wapt swap 2 string data without using temp variable
public class p8 {
	
	public static void main(String[] args) {
		String s1 ="Disha";
		String s2 ="Patani";
		System.out.println("Before Swaping");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("----------------------");
		s1 = s1+s2;
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After Swaping");
		System.out.println(s1);
		System.out.println(s2);
	}

}
