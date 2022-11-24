package programs;

public class Wrapper_boxing {
	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		Integer i=a;
		System.out.println(i);
		System.out.println(i.toString());
		Integer i1=Integer.valueOf(50);//explicit boxing
		System.out.println(i1);
	}
}
