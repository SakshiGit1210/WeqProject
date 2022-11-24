package programs;

public class Largest_element {
	public static void main(String[] args) {
		int a[]= {2,3,4,1,5,7,6,8};
		int large = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>large) {
				large=a[i];
			}
		}
		System.out.println(large);
	}
}
