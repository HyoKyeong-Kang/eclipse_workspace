package supermethod;

class A {
	A(){
		this(3);
		System.out.println("A 생성자 1");
	}
	
	A(int i){
		//생성자는 항상 첫줄에 this(),super() 가 있어야한다.
		//없는 경우 컴파일러가 자동으로 super()를 추가
		//super();  ---A의 부모는 누구? -> object
		System.out.println("A 생성자 2");
	}
}

class B extends A {
	B(){
		this(3);
		System.out.println("B 생성자 1");
	}
	B(int i) {
		super();
		System.out.println("B 생성자 2");
	}
}



public class Supermethod {
public static void main(String[] args) {
	//A 객체 생성
//	A aa1 = new A();
//	A aa2 = new A(3);
	
//	B bb1 = new B();
	B bb2 = new B(3);
}
}
