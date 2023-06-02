
interface A1 {
	void abc(int k);
}

class B1 {
	static void bcd() {
		System.out.println("메서드");
	}
	
}

public class RefOfIntanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new A1() {
			
			@Override
			public void abc(int k) {
				// TODO Auto-generated method stub
			System.out.println(k);	
			}
			
		};
		A1 a2 = System.out::println;
		a1.abc(5);
		a2.abc(5);
	}

}
