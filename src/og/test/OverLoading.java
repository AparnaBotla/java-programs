package og.test;

public class OverLoading {
	public void empid(String name) {
		System.out.println("String mthod"+name);
	}
	public static void main(String[] args) {
		OverLoading or=new OverLoading();
		or.empid("aparna");
	}

}
