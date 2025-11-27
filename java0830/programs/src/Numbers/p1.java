package Numbers;
/* wap to swap two numbers with the temp var */
public class p1 {
	public static void main(String[] args) {
		int a=300;
		int b=600;
		System.out.println("Before swapping "+ a + "," + b);
		int temp= a;
		a=b;
		b=temp;
		System.out.println("After swapping "+ a + "," + b);
	}
}
