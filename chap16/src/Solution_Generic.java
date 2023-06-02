
class Apple{}
class Pencil {}

//상품을 관리할 수 있는 클래스
class Goods<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Solution_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.  Goods 를 이용해 Apple 객체를 추가하거나 가져오기
		Goods<Apple> goods1 = new Goods<>();
		goods1.setT(new Apple()); //객체 추가
		Apple apple = goods1.getT(); //객체 가져오기
		
		// 2. Goods 를 이용해 Pencil 객체를 추가하거나 가져오기
		Goods<Pencil> goods2 = new Goods<>();
		goods2.setT(new Pencil());//객체 추가
		Pencil pencil = goods2.getT();//객체 가져오기
		
		Goods g = new Goods(); //Goods<Object> g = new Goods<>();
		Goods g = new Goods(); 
		
		
	}

}
