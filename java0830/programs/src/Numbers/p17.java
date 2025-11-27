package Numbers;
//wapt find the sum of even num and sum of of odd num from 1-100
public class p17 {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i%2==0) {
				System.out.print(i+=i);
			}
		}
	}
}
