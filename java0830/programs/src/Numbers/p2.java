package Numbers;
/* wap to swap 2 nos without temp var*/
public class p2 {
	
	public static void main(String[] args) {
		int a=300;
		int b=600;
		System.out.println("Before swapping "+ a + "," + b);
		a=a+b; //300+600=900=a
		b=a-b; //900-600=300=b
		a=a-b; //900-300=600=a
		System.out.println("After swapping "+ a + "," + b);
	}
}
