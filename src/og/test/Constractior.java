package og.test;

public class Constractior {
	public void sample() {
		System.out.println("default constructor");
	}

	public void sample(int id) {
		System.out.println("int para constructor");

	}

	public static void main(String[] args) {
		Constractior cc = new Constractior();
		cc.sample();
		cc.sample();
	}

}
