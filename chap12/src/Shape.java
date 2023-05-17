
public abstract class Shape { // 추상클래스도 클래스라서 멤버를 가질 수 있다.
	String color; // 필드

	abstract double area();
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape 클래스 생성자 호출");
		this.color = color;
	}
	
	public String getColor() { return color;}
	
}
