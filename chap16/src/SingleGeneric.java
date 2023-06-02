
class MyClass<T> { //클래스를 정의하는 시점에 타입 지정 x
	private String t;

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	
}



public class SingleGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//클래스 객체를 생성할 때 , 어떤 타입인지 지정
		MyClass<String> mc1 = new MyClass<>(); // String 타입만 저장하고, 꺼내올 수 있는 객체
		MyClass<String> mc2 = new MyClass<>(); // Integer(int) 타입만 저장하고, 꺼내올 수 있는 객체
		
		mc1.setT("안녕");
		System.err.println(mc1.getT());
//		mc1.setT(3); // 강한 타입체크로 문법 오류 발생
			
		}

}
