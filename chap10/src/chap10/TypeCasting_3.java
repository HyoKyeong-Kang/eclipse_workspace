package chap10;

class A{}

class B extends A {}

public class TypeCasting_3 {
	public static void main(String[] args) {
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);

		
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);
		
		if(aa instanceof B) {
			B b =(B) aa;
			System.out.println("aa를 B로 캐스팅 했습니다.");
		} else {
			System.out.println("aa는 B타입으로 캐스팅이 불가능!!!");
		}
		if(ab instanceof B) {
			System.out.println("ab를 B로 캐스팅 했습니다.");
		} else {
			System.out.println("ab는 B타입으로 캐스팅이 불가능!!!");
		}
		if("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스 입니다.");
		}
		
	
	}
}