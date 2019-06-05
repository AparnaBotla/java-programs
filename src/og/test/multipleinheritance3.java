package og.test;

public class multipleinheritance3 implements multipleinheitance, multibleinheritance2 {
	public void chair() {
		System.out.println("table");
		}
		@Override
		public void table() {
					System.out.println("1233");
				}
		public static void main(String[] args) {
			multipleinheritance3 s= new multipleinheritance3();	
			s.table();
		s.chair();
			
		}
			
}

			