package programs;

public class Wrapper_unboxing {
	public static void main(String[] args) {
		Integer i= 10;
		System.out.println(i);
		System.out.println(i.toString());
		int a=i;
		System.out.println(a);
		int b=i.intValue();
		System.out.println(b);
	}
}
