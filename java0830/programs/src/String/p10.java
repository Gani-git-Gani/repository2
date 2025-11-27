package String;
//wapt count the no of vowels,consonants and digits in a sentence
public class p10 {

	public static void main(String[] args) {
		String s = "Deepika is 5 10 tall and beautiful";
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		int vowels = 0, consonants = 0, digits = 0;
		for (char lv : ch) {
			if ( lv == 'a' ||lv == 'e' ||lv == 'i' ||lv == 'o' ||lv == 'u' )
			{
				vowels++;
			} 
			else if (lv>='a'&&lv<='z')
			{
				consonants++;
			}
			else if (lv>='0'&&lv<='9')
			{
				digits++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
		System.out.println(digits);
	}
}
