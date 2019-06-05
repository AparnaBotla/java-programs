package og.test;

import org.sample.AshokBank;

public class PartiallyAbstraction2 extends Partiallyabstraction {
	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("6%");

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("4%");

	}

	public static void main(String[] args) {

		PartiallyAbstraction2 bank = new PartiallyAbstraction2();

		bank.saving();
		bank.deposit();
		bank.saving();

	}
}
