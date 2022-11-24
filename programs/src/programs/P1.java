package programs;

public class P1 {

	private int a;
	private String name;

	private String show() {
		return "Showing";
	}

	public int getA() {
		System.out.println(this.show());
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
