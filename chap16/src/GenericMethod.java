
class A { //일반 클래스 A안에 제네릭 메서드 포함
	public <T> T method1(T t){
		return t;
	}

	public <T> boolean method2(T t1, T t2) {
		// 제네릭 타입 변수 T를 하나 받는다. - 메서드가 호출될 때 타입이 치환됨
		// 리턴 타입 - boolean /return 값은 항상 boolean 값.
		// 매개변수 - 제네릭 타입으로 지정되어 있다

		return t1.equals(t2);
	}

	public <K, V> void method3 (K k, V v) {
		System.out.println(k + ":" + v);
	}

}

public class GenericMethod {

	public static void main(String[] args) {

		A a = new A();
		
		String str1 = a.method1("안녕");
	}

}
