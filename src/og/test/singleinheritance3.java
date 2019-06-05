package og.test;

public class singleinheritance3 extends singleinhritance {
	
	public void chaildname()
	{
		System.out.println("navya");
		
	}
	public void chaildclass()
	{
		System.out.println("firstclass");
	}
public static void main(String[] args) {
	singleinheritance3 c=new singleinheritance3();
	c.chaildclass();
	c.chaildname();
	c.parentname();
	c.parentid();
	
}
}
