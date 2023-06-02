interface E {
	G abc(int k);
}

interface F {
	G abc();
}

class G {
	G() {
		System.out.println("첫번째 생성자");
	}

	G(int k) {
		System.out.println("두번째 생성자 " + k);
	}
}

public class RefOfClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//람다식
		E e = k -> new G(3);
		F f = () -> new G();
		
		//클래스 생성자 참조
		E e1 = G::new;
		F f1 = G::new;
		e1.abc(5);
		f1.abc();
	}

}
