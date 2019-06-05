package og.test;

public class FullyAbstraction2 implements FullyAbstraction {
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("5%");
	}

	@Override
	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("6%");

	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stuby
		System.out.println("9%");

	}

	public static void main(String[] args) {
		FullyAbstraction2 bank = new FullyAbstraction2();
		bank.deposit();
		bank.fixed();
		bank.saving();
	}

}
