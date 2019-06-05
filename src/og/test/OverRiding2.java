package og.test;

public class OverRiding2 extends OverRiding {
public void deposit() {
	System.out.println("5%");
}
public void fixed() {
	System.out.println("7%");
}
public static void main(String[] args) {
	OverRiding2 bank=new OverRiding2();
	bank.deposit();
	bank.fixed();
	bank.saving();
}
}
