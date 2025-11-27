package Numbers;
/*wap to print no 1-100 without loops*/
public class p5 {
	static int num=1;

	public static void main(String[] args) {
		System.out.println(num++);
		if (num<=100) {
			main(null);
		}
	}
}
